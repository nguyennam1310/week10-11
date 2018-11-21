/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class Week_10 {
    private List<String> list;

    public List<String> getAllFunctions(File path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains("/*")) {
                while (!line.contains("*/")) {
                    line = br.readLine();
                }
            }
            if (line.contains("static") && line.endsWith("{")) {
                String str = "";
                str += (line + "\n");
                while ((line = br.readLine()) != null) {
                    String str2 = line;
                    str += (str2 + "\n");
                    if (str2.endsWith("}")) {
                        break;
                    }
                }
                list.add(str);
            }
        }
        return list;
    }

    public void showAllList() {
        list.forEach((lists) -> {
            System.out.println(lists);
        });
    }

    public String findFunctionByName(String name) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Week_10\\src\\week_10\\Utils.java"));
        boolean check = false;
        String line;
        String str = "";
        while ((line = br.readLine()) != null) {
            if (line.contains(name) && line.endsWith("{")) {
                str += (line + "\n");
                while ((line = br.readLine()) != null) {
                    String str2 = line;
                    str += (str2 + "\n");
                    if (str2.endsWith("}")) {
                        break;
                    }
                }
                check = true;
            }
        }
        if (check) {
            return str;
        } else {
            return "ham khong tim thay!";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Week_10 test = new Week_10();
    
        System.out.println("Tất cả hàm static trong file Utlis: ");

        List<String> list = test.getAllFunctions(new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Week_10\\src\\week_10\\Utils.java"));
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        System.out.println("Tìm hàm: " + "readContentFromFile");
        System.out.println("Hàm cần tìm: ");
        System.out.println(test.findFunctionByName("readContentFromFile"));
    }
    
}
