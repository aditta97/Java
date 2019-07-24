
package javaio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Vector;


public class JavaIO {

    
      public static void fileOutputStream() throws FileNotFoundException,IOException{ 
          
             File file=new File("myfile.txt");
             FileOutputStream fo=new FileOutputStream(file,true);
//             fo.write(45);
//             fo.flush();
//             fo.close();
             String h="Hello world";
             byte[] myByte=h.getBytes();
             fo.write(myByte);
             fo.flush();
             fo.close();
          
           }
      public static void fileInputStream() throws FileNotFoundException,IOException{ 
          
            File file=new File("myfile.txt");
            FileInputStream fi=new FileInputStream(file);
            int i=0;
            while((i=fi.read())!=-1){
            System.out.print((char)i);
            }
           }

      
      public static void bufferedOutputStream() throws FileNotFoundException,IOException{ 
          
            File file=new File("myfile1.txt");
            
         
            FileOutputStream fo=new FileOutputStream(file);
            BufferedOutputStream bo=new BufferedOutputStream(fo);

            bo.write(12);
            bo.flush();
            bo.close();
            fo.close();
            
           }
      public static void bufferedInputStream() throws FileNotFoundException, IOException {

        File file = new File("myfile.txt");

        FileInputStream fi = new FileInputStream(file);
        BufferedInputStream bi = new BufferedInputStream(fi);
        int i = 0;
        while((i = bi.read()) != -1) {
            System.out.print((char) i);
        }

    }
      
      public static void sequenceInputStream() throws FileNotFoundException, IOException {
          
        File file1 = new File("myfile.txt");
        File file2 = new File("myfile1.txt");

        FileInputStream fi1 = new FileInputStream(file1);
        FileInputStream fi2= new FileInputStream(file2);
        FileInputStream fi3= new FileInputStream(file2);
          Vector v=new Vector();
          v.add(fi1);
          v.add(fi2);
          v.add(fi3);
          SequenceInputStream seqIn=new SequenceInputStream(v.elements());
       
        int i = 0;
        while((i = seqIn.read()) != -1) {
            System.out.print((char) i);
        }
        seqIn.close();
        fi1.close();
        fi2.close();
        fi3.close();

    }
      public static void byteArrayOutputStream() throws FileNotFoundException, IOException {
          
        File file1 = new File("myfile30.txt");
        File file2 = new File("myfile31.txt");

        FileOutputStream fi1 = new FileOutputStream(file1,true);
        FileOutputStream fi2= new FileOutputStream(file2);
       
          ByteArrayOutputStream bytOut=new ByteArrayOutputStream();
          String v="This string is pasted here here ith byteArrayOutputStream";
          bytOut.write(v.getBytes());
          bytOut.writeTo(fi1);
          bytOut.writeTo(fi2);
          bytOut.flush();
          bytOut.close();
          fi2.close();
          fi1.close();
          

    }
            public static void fileWriter() throws FileNotFoundException,IOException{ 
          
            File file=new File("myfile44.txt");
            FileWriter wr=new FileWriter(file);
            wr.write("I am wrr");
            wr.flush();
            wr.close();
           }
      
      
      
      public static void main(String[] args) throws IOException {
        //fileOutputStream();
        //fileInputStream();
        //bufferedOutputStream();
        //bufferedInputStream();
        //sequenceInputStream();
        //byteArrayOutputStream();
        fileWriter();
        
    }
      
    
}
