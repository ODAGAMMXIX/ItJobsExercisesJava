package br.com.osia;

import java.util.*;

public class JavaStdInNStdOutI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int read01 = scan.nextInt();
        int read02 = scan.nextInt();
        int read03 = scan.nextInt();
      

        System.out.println(read01);
        System.out.println(read02);
        System.out.println(read03);
        
        scan.close();
    }
}
