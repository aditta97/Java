/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show.current.time;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author adittachakraborty
 */
public class NewClass {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("nnn.txt");

            System.out.println("Enter you Bagla: ");
            Scanner input = new Scanner(System.in);
            String banglaText = input.nextLine();

            fw.write(banglaText);
            fw.flush();
            fw.close();

            try {
                FileReader fr = new FileReader("nnn.txt");
                BufferedReader br = new BufferedReader(fr);
                StringBuilder s = new StringBuilder();
                int i;
                try {
                    while ((i = br.read()) != -1) {
                        s.append((char) i);
                    }
                    //txtOutput.setText(s.toString() + "\n");
                    System.out.println(s.toString() + "\n");
                    br.close();
                    fr.close();

                    FileWriter fwnew = new FileWriter("nnn222.txt");

                    //System.out.println("Enter you Bagla: ");
                    //Scanner input = new Scanner(System.in);
                    fwnew.write(s.toString());

                    //fwnew.write(banglaText);
                    fwnew.flush();
                    fwnew.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "\"Website URLs.txt\" File Error", "Can't Read File", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
