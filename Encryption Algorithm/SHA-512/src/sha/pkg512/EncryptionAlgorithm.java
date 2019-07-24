package sha.pkg512;

import java.util.Base64;

public class EncryptionAlgorithm {

    int[] xorX;
    int[] xorY;
    String[][][] myblock;//String array, because of the Hex values will be string
    String[][] keyblock = new String[4][4];  //key storage
    final String[][] mixText={
        {"02","03","01","01"},
        {"01","02","03","01"},
        {"01","01","02","03"},
        {"03","01","01","02"}
    };
    public String Text = "";
    public String Key = "";
    public String plainText = "";
    public int length;
    public int block;
    String encryptedText = "";
    String encoded = "";
    String decoded = "";

    void encodeMyData() {
        encoded = "";
        encoded = Base64.getEncoder().encodeToString(plainText.getBytes());
    }

    void decodeMyData() {
        decoded = "";
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        decoded = new String(decodedBytes);
    }

    void printArray(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {
                System.out.print(myblock[tempblock][second][third] + ",");
            }
            System.out.println();
        }
        System.out.println(".................");
    }

    void convertToAscii(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {

                myblock[tempblock][second][third] = Integer.toString((int) (myblock[tempblock][second][third].charAt(0)));

            }

        }
    }

    void interchangeC2andC3(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 1; third <= 1; third++) {
                String temp = myblock[tempblock][second][third];
                myblock[tempblock][second][third] = myblock[tempblock][second][third + 1];
                myblock[tempblock][second][third + 1] = temp;
            }
        }
    }

    void interchangeR2andR3(int tempblock) {
        for (int second = 1; second <= 1; second++) {
            for (int third = 0; third < 4; third++) {
                String temp = myblock[tempblock][second][third];
                myblock[tempblock][second][third] = myblock[tempblock][second + 1][third];
                myblock[tempblock][second + 1][third] = temp;
            }

        }
    }

    void performC1XORC2(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 1; third++) {
                int c1 = Integer.parseInt(myblock[tempblock][second][third]);
                int c2 = Integer.parseInt(myblock[tempblock][second][third + 1]);
                xorX[second] = c1 ^ c2;
                System.out.println(xorX[second]);
            }

        }
    }

    void performC3XORC4(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 2; third < 3; third++) {
                int c3 = Integer.parseInt(myblock[tempblock][second][third]);
                int c4 = Integer.parseInt(myblock[tempblock][second][third + 1]);
                xorY[second] = c3 ^ c4;
                System.out.println(xorY[second]);
            }

        }
    }

    void replaceC1ByXorX_C4ByXorY(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 1; third++) {
                myblock[tempblock][second][third] = Integer.toString(xorX[second]);
                myblock[tempblock][second][third + 3] = Integer.toString(xorY[second]);
            }

        }
    }

    void printKeyArray() {
        for (int first = 0; first < 4; first++) {
            for (int second = 0; second < 4; second++) {
                System.out.print(keyblock[first][second] + ",");
            }
            System.out.println();
        }

        System.out.println("............");
    }

    void convertKeyToASCII() {
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {

                keyblock[second][third] = Integer.toString((int) (keyblock[second][third].charAt(0)));

            }

        }
    }

    void performXorBetweenTextAndKey(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {
                int c3 = Integer.parseInt(myblock[tempblock][second][third]);
                int c4 = Integer.parseInt(keyblock[second][third]);
                myblock[tempblock][second][third] = Integer.toString(c3 ^ c4);

            }

        }
    }

void mixMatrix(int tempblock){
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {
                int BlockText = Integer.parseInt(myblock[tempblock][second][third]);
                int MixText = Integer.parseInt(mixText[second][third]);
                myblock[tempblock][second][third] = Integer.toString(BlockText ^ MixText);

            }

        }

}

    void reverseTwoDimentionalArray(int tempblock) {
        //reverse first phase: reverse columns
        for (int second = 0; second < 4; second++) {
            int first = 0, last = 3;
            for (int third = 0; third < 4 / 2; third++) {

                String temp1 = myblock[tempblock][second][first];
                myblock[tempblock][second][first] = myblock[tempblock][second][last];
                myblock[tempblock][second][last] = temp1;
                first++;
                last--;
                if (first > last) {
                    break;
                }
            }

        }

        //reverse first phase: reverse rows
        int first = 0, last = 3;
        for (int second = 0; second < 4; second++) {

            for (int third = 0; third < 4; third++) {
                String temp1 = myblock[tempblock][first][third];
                myblock[tempblock][first][third] = myblock[tempblock][last][third];
                myblock[tempblock][last][third] = temp1;
            }
            first++;
            last--;
            if (first > last) {
                break;
            }

        }
    }

    void convertMyBlockIntoHexa(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {
                myblock[tempblock][second][third] = Integer.toHexString(Integer.parseInt(myblock[tempblock][second][third])).toUpperCase();
            }

        }
    }

    void replaceBySBox(int tempblock) {
        Sbox box = new Sbox();
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {
                myblock[tempblock][second][third] = box.getSBoxValue(myblock[tempblock][second][third]);

            }

        }
    }

    String encrypt(EncryptionAlgorithm ob) {
        plainText = "";
        length = 0;
        block = 0;
        decoded = "";
        encryptedText = "";
        int loc = 0;  //for char location in the Text

        ob.length = ob.Text.length();

        //debug purpuse// delete it later
        System.out.println(ob.Text + "  length= " + ob.length);

        //generating no of block     
        ob.block = (int) Math.ceil((double) ob.length / 16);
        System.out.println(ob.block);  //printing no of block
        int tempBlock = 1;

//        String f=Integer.toHexString(163);
//        int a=Integer.parseUnsignedInt(f, 16);
//        System.out.println(a);
        //initialize array
        myblock = new String[ob.block][4][4];
        //first block then second block.................
        while (tempBlock <= ob.block) {

            //inserting characters into blocks//
            for (int second = 0; second < 4; second++) {  //second dimension
                for (int third = 0; third < 4; third++) {     //third dimension
                    if (loc < ob.length) {  // if string index exceded, pading is required
                        /*tempBlock-1 because of first array index is zero
              characters are converted into string
                         */

                        myblock[tempBlock - 1][second][third] = Character.toString(ob.Text.charAt(loc));
                        loc++;  //incrementing last char pos in the Text
                    } else {
                        myblock[tempBlock - 1][second][third] = "0";  //pading started
                    }
                }
            }
            //end of assigning chars into block

            //printing the matrixes
            printArray(tempBlock - 1);
            //end of print matrix

            //converting to ASCII
            convertToAscii(tempBlock - 1);
            //end of ASCII convert

            //printing the matrix
            System.out.println("\n Converted to ASCII:");
            printArray(tempBlock - 1);

            //permutation part started//
            //interchanging between c2&c3        
            interchangeC2andC3(tempBlock - 1);
            //end of interchange column

            //printing the matrix
            System.out.println("\n Column interchange (c2 and c3):");
            printArray(tempBlock - 1);

            //interchaging rows beteen r2 and r3
            interchangeR2andR3(tempBlock - 1);
            //end of interchange row

            //printing the matrix
            System.out.println("\n Row interchange (r2 and r3):");
            printArray(tempBlock - 1);
            //matrix printed

            xorX = new int[4];
            System.out.println("c1 xor c2:");
            //c1 (xor) c2
            performC1XORC2(tempBlock - 1);
            //end of XOR

            xorY = new int[4];
            System.out.println("c3 xor c4:");
            //c3 (xor) c4
            performC3XORC4(tempBlock - 1);
            //end of XOR

            //replace c1 by xorX and c4 by xorY
            replaceC1ByXorX_C4ByXorY(tempBlock - 1);
            //end of replace

            //printing the matrix
            System.out.println("\n Replace c1 by xorX and c4 by xorY:");
            printArray(tempBlock - 1);
            //matrix printed

            //KEY MODIFICATION
            int keyLoc = 0;
            //inserting characters into blocks//
            for (int first = 0; first < 4; first++) {  //second dimension
                for (int second = 0; second < 4; second++) {     //third dimension
                    if (keyLoc < ob.Key.length()) {  // if string index exceded, pading is required
                        /*
              characters are converted into string
                         */

                        keyblock[first][second] = Character.toString(ob.Key.charAt(keyLoc));
                        keyLoc++;  //incrementing last char pos in the Text
                    } else {
                        keyblock[first][second] = "0";  //pading started
                    }
                }
            }
            //end of assigning chars into block

            //printing key matrix
            System.out.println("Characters assigned to 4*4 Matrix:");
            printKeyArray();
            //matrix printed

            //converting key to ASCII
            convertKeyToASCII();
            //end of ASCII convert

            //printing key matrix
            System.out.println("Converted to ASCII");
            printKeyArray();
            //matrix printed

            //XOR between TextBlock and KeyBlock
            performXorBetweenTextAndKey(tempBlock - 1);
            //end of XOR

            //printing matrix
            System.out.println("XOR beteen TextBlock and KeyBlock: ");
            printArray(tempBlock - 1);
            //end of print

            //mixing matrix
            
            mixMatrix(tempBlock-1);
            
            //mixing ended
            
            //printing matrix
            System.out.println("After Mixing");
            printArray(tempBlock - 1);
            //end of print
            
            //reversing the block
            reverseTwoDimentionalArray(tempBlock - 1);
            //reverse completed

            //printing matrix
            System.out.println("In reverse Order: ");
            printArray(tempBlock - 1);
            //end of print

            //convert into Hexadecimal
            convertMyBlockIntoHexa(tempBlock - 1);
            //converted completed

            //printing matrix
            System.out.println("Converted into Hexadecimal: ");
            printArray(tempBlock - 1);
            //end of print

            //replace values using S-Box
            replaceBySBox(tempBlock - 1);
            //replace completed

            //printing matrix
            printArray(tempBlock - 1);
            //end of print

            tempBlock++;
        }
        //arranging into plain text
        for (int i = 0; i < ob.block; i++) {
            for (int second = 0; second < 4; second++) {
                for (int third = 0; third < 4; third++) {
                    ob.plainText = ob.plainText + " " + myblock[i][second][third];
                }

            }

        }
        ob.plainText = ob.plainText.substring(1, ob.plainText.length());
        System.out.println("\nPlainTxt: " + ob.plainText);
        //Encode Character
        ob.encodeMyData();
        //encoded
        
        System.out.println("\n Encoded: " + ob.encoded);
        
        return ob.encoded;  //final encoded text

    }

    void printDecryptArray() {
        for (int block = 0; block < this.block; block++) {
            for (int second = 0; second < 4; second++) {
                for (int third = 0; third < 4; third++) {
                    System.out.print(myblock[block][second][third] + ",");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(".................");
    }

    void replaceByReverseSBox(int tempblock) {
        
        try{Sbox box = new Sbox();
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {
                myblock[tempblock][second][third] = box.getReverseSBoxValue(myblock[tempblock][second][third]).toUpperCase();

            }
        }
        }
        catch(Exception e){
        javax.swing.JOptionPane.showMessageDialog(null,"Error found");
        }
    }

    void convertToAsciiFromHex(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {
                myblock[tempblock][second][third] = Integer.toString(Integer.parseUnsignedInt(myblock[tempblock][second][third], 16));
            }

        }
    }

    void blockOperationWhileDecrypting(int tempBlock) {
//        if (tempBlock % 2 == 0) {  //if no block serial is even
//            int temp1 = Integer.parseInt(myblock[tempBlock - 1][2][2]);
//            if (temp1 % 2 != 0) {
//                temp1 = temp1 - 1;
//                myblock[tempBlock - 1][2][2] = Integer.toString(temp1);
//            }
//
//        } else { //if ODD BLOCK
            int temp1 = Integer.parseInt(myblock[tempBlock - 1][1][1]);
            if (temp1 % 2 != 0) {
                System.out.println("Minus 1: "+temp1);
                temp1 = temp1-1 ;
                System.out.println(temp1);
                myblock[tempBlock - 1][1][1] = Integer.toString(temp1);
            }
        
    }

        void performTextBlockXORKeyBlockinDecrypt(int tempblock) {
        for (int second = 0; second < 4; second++) {
            for (int third = 0; third < 4; third++) {
                int txtColumn = Integer.parseInt(myblock[tempblock][second][third]);
                int keyColumn = Integer.parseInt(keyblock[second][third]);
                myblock[tempblock][second][third] = Integer.toString(txtColumn ^ keyColumn);

            }

        }
    }

    String decrypt(EncryptionAlgorithm ob) {
        //variable Key has the ciper text
        plainText = "";
        
        int start = 0, end = 2;

        keyblock = new String[4][4];  //key storage

        //decoding
        ob.decodeMyData();
        //decoded
        
        System.out.println("\n Ne: " + ob.decoded);
        
        int totalChars = 0;
        //counting total cells
        for (int i = 0; i < ob.decoded.length(); i++) {
            if (ob.decoded.charAt(i) != ' ') {
                totalChars++;
            }
        }
        
        //as each data is two chars long so /2
        int cells = totalChars / 2;
        //final total block needed
        
        ob.block = (int) Math.ceil((double) cells / 16);
        myblock = new String[ob.block][4][4];//String array, because of the Hex values will be string

        //assigning values into array
        System.out.println(ob.decoded.charAt(0));
        for (int i = 0; i < ob.block; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (start < decoded.length()) {

                        myblock[i][j][k] = ob.decoded.substring(start, end);

                        start = end + 1;
                        end = start + 2;

                    } else {
                        myblock[i][j][k] = "0";
                    }

                }
            }
        }
        //assigned

        //printing matrix
        System.out.println("ASSIGNED INTO ARRAY");
        printDecryptArray();
        //end of print

        int tempBlock = 1;
        //block loop started

        while (tempBlock <= ob.block) {

            //replace values using S-Box
            replaceByReverseSBox(tempBlock - 1);
            //replace completed

            //printing matrix
            System.out.println("Converted into Hexadecimal: ");
            printArray(tempBlock - 1);
            //end of print

            //convert into Decimal ASCII
            convertToAsciiFromHex(tempBlock - 1);
            //convert completed

            //printing matrix
            System.out.println("Converted into ASCII: ");
            printArray(tempBlock - 1);
            //end of print
             
            //reversing the block
            
            //reverse first phase: reverse columns
            reverseTwoDimentionalArray(tempBlock - 1);
            //reverse completed
            
            //printing matrix
            System.out.println("After Reverse: ");
            printArray(tempBlock - 1);
            //end of print
            
            //Mixing started
            mixMatrix(tempBlock-1);
            //Mixing Ended
            
            //printing matrix
            System.out.println("Block cell modified: ");
            printArray(tempBlock - 1);
            //end of print

            

            //KEY MODIFICATION
            int keyLoc = 0;
            //inserting characters into blocks//
            for (int first = 0; first < 4; first++) {  //second dimension
                for (int second = 0; second < 4; second++) {     //third dimension
                    if (keyLoc < ob.Key.length()) {  // if string index exceded, pading is required
                        /*
              characters are converted into string
                         */

                        keyblock[first][second] = Character.toString(ob.Key.charAt(keyLoc));
                        keyLoc++;  //incrementing last char pos in the Text
                    } else {
                        keyblock[first][second] = "0";  //pading started
                    }
                }
            }
            //end of assigning chars into block

            //printing key matrix
            System.out.println("Key Characters assigned to 4*4 Matrix:");
            printKeyArray();
            //matrix printed

            //converting to ASCII
            convertKeyToASCII();
            //end of ASCII convert

            //printing key matrix
            System.out.println("Converted to ASCII");
            printKeyArray();
            //matrix printed

            //XOR between TextBlock and KeyBlock
            performTextBlockXORKeyBlockinDecrypt(tempBlock - 1);
            //end of XOR

            //printing key matrix
            System.out.println("After XOR  between TextBlock and KeyBlock");
            printArray(tempBlock - 1);
            //matrix printed

            xorX = new int[4];
            System.out.println("c1 xor c2:");
            //c1 (xor) c2
            performC1XORC2(tempBlock - 1);
            //xor complete

            xorY = new int[4];
            System.out.println("c3 xor c4:");
            //c3 (xor) c4
            performC3XORC4(tempBlock - 1);
            //xor completed

            //replace c1 by xorX and c4 by xorY
            replaceC1ByXorX_C4ByXorY(tempBlock - 1);
            //end of replace

            //printing the matrix
            System.out.println("\n Replace c1 by xorX and c4 by xorY:");
            printArray(tempBlock - 1);
            //matrix prin   ted

            //interchaging rows beteen r2 and r3
            interchangeR2andR3(tempBlock - 1);
            //end of interchange row

            //printing the matrix
            System.out.println("\n Row interchange (r2 and r3):");
            printArray(tempBlock - 1);
            //matrix printed

            //interchanging between c2&c3        
            interchangeC2andC3(tempBlock - 1);
            //end of interchange column

            System.out.println("\n Column interchange (c2 and c3):");
            printArray(tempBlock - 1);
            //print end

            //converting to ASCII
            for (int second = 0; second < 4; second++) {
                for (int third = 0; third < 4; third++) {

                    myblock[tempBlock - 1][second][third] = Character.toString((char) Integer.parseInt(myblock[tempBlock - 1][second][third]));

                }

            }
            //end of ASCII convert

            //printing the matrix
            System.out.println("\n Converted to Character:");
            printArray(tempBlock - 1);
            //print end

            //arranging into plain text
            for (int second = 0; second < 4; second++) {
                for (int third = 0; third < 4; third++) {
                    ob.plainText = ob.plainText + "" + myblock[tempBlock - 1][second][third];
                }

            }

            tempBlock++;
        }

        return ob.plainText;

    }

}
