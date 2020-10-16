package edy.smg;

import java.util.Scanner;
public class WorkingAnagram{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        scanner.close();
        boolean isAnagram = true;
        String copy2 = word2;
        int lenght1 = word1.length();
        char charInWord1;
        for(int i = 0; i < lenght1; i++){
             charInWord1 = word1.charAt(i);
            if(charInWord1 >= 'a' && charInWord1<='z'
            || charInWord1 >= 'A' && charInWord1 <= 'Z' ){
                int position2 = copy2.indexOf(charInWord1);
                if(position2 == -1){
                    isAnagram = false;
                    break;
                }
                else{
                    copy2 = copy2.substring(0,position2) + copy2.substring(position2 +1);
                }
            }
        }
       
        if(isAnagram){
            int charsLeft = copy2.length();
            for(int i = 0; i < charsLeft; i ++){
                char Char = copy2.charAt(i);
                 if(Char >= 'a' && Char<='z'
            || Char >= 'A' && Char <= 'Z' ){
                isAnagram = false;
                break;
            }
           
        }
       
       
        }
       
        if(isAnagram){
            System.out.println("The words are anagrams");
        }
        else{
            System.out.println("The words are not anagrams");
        }
       
     }
}