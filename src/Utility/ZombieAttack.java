package Utility;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.



        int[] emptyArr = new int[inhabitants.length];
        int[] tempArr = new int[inhabitants.length];

        for(int i = 0; i <= inhabitants.length-1; i++){
            tempArr[i] = inhabitants[i];
        }
        int day = 0;



        while (!Arrays.equals(inhabitants,emptyArr)){

            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));


            for (int i = 0; i<= inhabitants.length-1; i++){

                if (i == 0){
                    if(inhabitants[i+1] == 0){
                        tempArr[i] /= 2;
                    }
                }else if (i == inhabitants.length-1){
                    if(inhabitants[i-1] == 0){
                        tempArr[i] /= 2;
                    }
                }else if (inhabitants[i-1] == 0 || inhabitants[i+1] == 0){
                    tempArr[i] /= 2;
                }



            }

            for(int i = 0; i <= inhabitants.length-1; i++){
                inhabitants[i] = tempArr[i] ;
            }





            day++;





        }

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");



    }



}
