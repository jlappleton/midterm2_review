package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SomeClass {
    private int someInteger = 0;

    public int getSomeInteger() {
        return someInteger;
    }

    public void setSomeInteger(int someInteger) {
        this.someInteger = someInteger;
    }



    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        
        List<Integer> aryLst = new LinkedList<>();
        aryLst.add(1);
        aryLst.add(2);
        aryLst.add(3);
        //https://github.com/jlappleton/midterm2_review
        String s = "1 2 3 4 5";
        boolean check = false;
        do {
            try {
                //prompted and took input from user
                File f = new File("text.txt");
                Scanner scnr = new Scanner(f);
                for (int i = 0; i < 3; i++) {
                    System.out.println(scnr.nextInt());
                }
                scnr.close();
                check = false;
            } catch (Exception e) {
                System.out.println("Uh-oh enter valid filename");
                check = true;
            }
        } while(check);
        for(int i = 0; i < 3; i++) {
            System.out.println(aryLst.get(i));
            //System.out.println(scnr.nextInt());
        }

        for(int i: aryLst) {
            System.out.println(i);
        }

        if (aryLst.get(2) == 4){ /*something*/}
        if ( (aryLst.get(2) == 4) || (aryLst.get(2) == 3) ){/*something*/}
        if ( (aryLst.get(2) == 4) && (aryLst.get(2) == 3) ){/*something*/}

        String[] sAry = {"one", "two", "three"};
        sAry[2] = "hello";

        for(String i: sAry) {
            System.out.println(i);
        }

        System.out.println("done");
    }
}
