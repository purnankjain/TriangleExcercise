package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int i,j,n;
        String input = "";

        System.out.println("Print One Asterisk : ");
        System.out.println("*");
        System.out.println();

        System.out.println("Print Horizontal Line : ");
        System.out.println("Enter n");
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        try{
            input = bf.readLine();
        }
        catch(Exception e){
        }
        n = Integer.parseInt(input);
        for(i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println();

        System.out.println("Print Vertical Line : ");
        System.out.println("Enter n");
        bf = new BufferedReader( new InputStreamReader(System.in));
        try{
            input = bf.readLine();
        }
        catch(Exception e){

        }
        n = Integer.parseInt(input);
        for(i=0;i<n;i++){
            System.out.println("*");
        }
        System.out.println();
        System.out.println();


        System.out.println("Print Right triangle : ");
        System.out.println("Enter n");
        bf = new BufferedReader( new InputStreamReader(System.in));
        try{
            input = bf.readLine();
        }
        catch(Exception e){

        }
        n = Integer.parseInt(input);
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();



    }
}
