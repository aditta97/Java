/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sha.pkg512;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

    public static String encryptThisString(String input) {
        try {
            //remove padding characters
            input = removeLastSpacesFromInput(input);

            System.out.println("Hasing Text: " + input);
            // getInstance() method is called with algorithm SHA-512 
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            // digest() method is called 
            // to calculate message digest of the input string 
            // returned as array of byte 
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value 
            String hashtext = no.toString(16);

            // Add preceding 0s to make it 32 bit 
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            System.out.println(hashtext);
            // return the HashText 
            return hashtext;
        } // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    static String removeLastSpacesFromInput(String hash) {
        StringBuilder st = new StringBuilder(hash);
        st.reverse();
        int spaceEnd = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '0') {
                spaceEnd++;
            } else {
                break;
            }
        }
        st.delete(0, spaceEnd);
        String st2 = new String(st.reverse());
        return st2;
    }

}
