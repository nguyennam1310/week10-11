/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_10;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Utils {
     public static final String path = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\Lab_9\\file.txt";
    public static final String path1 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\Lab_9\\file1.txt";

    public static String readContentFromFile(String path) {
        String s = null;
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        return s;

    }

    public static void writeContentToFile(String path) {
        try {
            String s = "abc";
            FileWriter fw = new FileWriter(path);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(s);
            fw.close();
            pw.close();

        } catch (IOException e) {
            System.out.println("Error!");
        }
    }

    public static void writeContentToFile2(String path) {
        try {
            String s = "abc";
            FileWriter fw = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(s);
            fw.close();
            pw.close();

        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
