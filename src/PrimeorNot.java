import java.util.Random;
import java.util.Scanner;


import java.util.Scanner;
  /*
      . make the user number not greater than 250 to check the program
      .a number that is only divisable  by it self and 1 is a prime number
      . a number that is an integer, that are divisable by 1, itself and other numbers are non prime number
      .print the number is either prime or not
      .make sure the class is accessable for any kind of users
      .note that prime number does not include any number below 1
      .represent 'i' as any positive integer
        . make the user number not greater than 250 to check the program
        .generate random number
*/


public class PrimeorNot {
    private static Scanner keyboard;

    public static void main(String[] args) {

        int x = 0, userNo;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number");
        userNo = keybd.nextInt();
        for (int counter = 1; counter <= userNo; counter++) {

            if (userNo % counter == 0) x++;
        }
        if (x == 2)
            System.out.println(userNo + "is a prime number. ");
        else
            System.out.println(userNo + "is not a prime number.");
      System.out.println( "I`m working on random ");

        int ranNo;
        Random randomNoGen = new Random();
        ranNo = randomNoGen.nextInt(250) + 1;
        x = 0;
        int index = 1;
        while (index <= ranNo) {
            if (ranNo % index == 0)
                x++;

        index++;

        }

        if (x==2)
            System.out.println(ranNo + "is a prime");
        else
            System.out.println(ranNo + "is Not a prime");


    }}

















