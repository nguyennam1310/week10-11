/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class Week_11 {
    
    
public static <T extends Comparable<T>> void sort(ArrayList<T> a){
        int n = a.size();
        Collections.sort(a);
    }

    public static <T extends Comparable<T>> T max(ArrayList<T> a){
        T x = a.get(0);
        for (int i=0; i<a.size(); i++)
            if (a.get(i).compareTo(x) > 0) x = a.get(i);
        return x;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
           ArrayList<Integer> a = new ArrayList<>();
           a.add(new Integer(1));
           a.add(new Integer(4));
           a.add(new Integer(2));
           a.add(new Integer(9));
           System.out.println("max: "+max(a)+"\n");
           sort(a);
            System.out.println("sort: \n");
           for(Integer x : a){
               System.out.println(x);
           }
           ArrayList<Double> b = new ArrayList<>();
           b.add(new Double(2.1));
           b.add(new Double(5.5));
           b.add(new Double(1.7));
           b.add(new Double(7.7));
           System.out.println("max: "+max(b)+"\n");
           sort(b);
            System.out.println("sort: \n");
           for(double x : b){
               System.out.println(x);
           }
           ArrayList<Character> c = new ArrayList<>();
           c.add(new Character('N'));
           c.add(new Character('A'));
           c.add(new Character('M'));
           c.add(new Character('Z'));
           System.out.println("max: "+max(c)+"\n");
           sort(c);
            System.out.println("sort: \n");
           for(char x : c){
               System.out.println(x);
           }
}
}
