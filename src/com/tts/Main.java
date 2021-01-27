package com.tts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Give me 5 numbers!");

        //Asks the user for 5 numbers

        Integer fiveArray1 = scanner.nextInt();
        Integer fiveArray2 = scanner.nextInt();
        Integer fiveArray3 = scanner.nextInt();
        Integer fiveArray4 = scanner.nextInt();
        Integer fiveArray5 = scanner.nextInt();

        // some how make fiveArray: [fiveArray1,fiveArray2,fiveArray3,fiveArray4,fiveArray5];
        List<Integer> fiveArray = new ArrayList<Integer>();
        fiveArray.add(fiveArray1);
        fiveArray.add(fiveArray2);
        fiveArray.add(fiveArray3);
        fiveArray.add(fiveArray4);
        fiveArray.add(fiveArray5);

        System.out.println("Thanks for your numbers");
        System.out.println(fiveArray);
        //somehow sort so we can retrieve first/smallest and last/largerst
        //sortingfive = .sort([0,1,2,3,4,]);
        //System.out.println(sortingfive);


        // get sum and product
        int sum = ((fiveArray1) + (fiveArray2) + (fiveArray3) + (fiveArray4) + (fiveArray5));
        int product = ((fiveArray1) * (fiveArray2 * (fiveArray3) * (fiveArray4) * (fiveArray5)));

        System.out.println("Here is the sum of your numbers:" + (sum));

        System.out.println("Here is the product of your numbers: " + (product));
        //int max = -10000000;
        int min=
        Collections.min(fiveArray);
        int max=
        Collections.max(fiveArray);

        System.out.print("The smallest number you entered was:");
        System.out.println(min);

        System.out.print("The largest number you entered was:");
        System.out.println(max);

            //Finds the sum, product, largest, and smallest of those numbers

        }

    }
