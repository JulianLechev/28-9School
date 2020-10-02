package edy.smg;

import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
   int height, width, lenght;
   Scanner in = new Scanner(System.in);
   System.out.println("Whats the height of the room?");
   height = in.nextInt();
   System.out.println("Whats the wodth of the room?");
   width = in.nextInt();
   System.out.println("Whats the lenght of the room?");
   lenght = in.nextInt();
   int space = lenght*height*2 + width*height*2 + width*lenght;
   int fiveLiters = space/140;
   int oneLiter = 1;
   int rest = space%140;
   if(rest>90){
     fiveLiters++;
   }
   else if(rest%30!=0) {
      oneLiter = rest/30+1;  
   }
   else {
     oneLiter = rest/30;
   }

  int price=fiveLiters*15 + oneLiter*4;
  System.out.println(price);
    }
}