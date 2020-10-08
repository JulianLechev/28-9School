package edy.smg;

public class uni {

    public static void main(String []args){
        double sum = 0;
        double tax = 10000;
        for(int i = 0; i < 14; i++){
            tax = tax*106/100;
            if(i>=10){
                sum += tax;
            }
        }
        System.out.println(sum);
     }
}

