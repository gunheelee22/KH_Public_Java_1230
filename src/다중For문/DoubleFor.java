package 다중For문;

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args) {
            for(int i=2; i< 10; i++){
                for(int j = 1; j< 10; j++)
                {
                    System.out.printf("%d x %d \n",i,j,(i*j));

                }
                System.out.println("-------------------");
            }

    }

}