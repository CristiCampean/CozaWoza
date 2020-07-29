package org.fasttrackIT;

public class CozaWozaLoza {

    public static void main(String[] args) {
        for (int i = 0; i <= 110; i++) {
            if ( i % 3 == 0 && i % 5 == 0  && i %7 == 0){
                System.out.print("CozaLozaWoza");
            }else if( i%5 ==0&& i%7 ==0){
                System.out.print("Coza Loza");
            }else if( i%3 ==0 && i%5 ==0){
                System.out.print("Coza Woza");
            }else if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.print("Loza");
            } else if (i % 7 == 0) {
                System.out.print("Woza");
            } else {
                System.out.print(i);
            }
                if (i % 11 == 0) {
                    System.out.println();

                } else {
                    System.out.print(" ");
                }
            }

        }
    }

