package edy.smg;

import java.util.Scanner;

public class starpyr {

	 public static void main(String []args){
         Scanner scanner = new Scanner(System.in);
         int row = 7;
         for(int i = 0; i < row; i++){
        	 for(int j = 0; j<i;j++){
        		System.out.print(" "); 
        	 }
        	 for(int j = 0; j <row -i; j++){
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	 	}
	 }