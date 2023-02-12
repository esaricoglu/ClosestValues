package Arrays;

import java.util.Scanner;

public class ClosestValues {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] list = {70, 68, 12, 27, 31, -17, -36, 59, -103};
        System.out.print("Dizi : {" );
        for(int i : list){
            System.out.print(i +",");
        }
        System.out.println("\b}");

        System.out.print("Girilen Sayı : ");
        int n = inp.nextInt();

        int closestSmall = Integer.MIN_VALUE;
        int closestBig = Integer.MAX_VALUE;

        for (int i : list) {
            if(n>i){
                if(closestSmall<i){
                    closestSmall = i;
                }
            }
            if(n<i){
                if(closestBig>i){
                    closestBig = i;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + closestSmall);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + closestBig);
    }
}

