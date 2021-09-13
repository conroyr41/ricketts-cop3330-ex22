/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        int[] values = new int[3];
        String output;
        int largestNum = -999;

        //get input
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Please enter an integer:");
            scan = new Scanner(System.in);
            values[i] = Integer.parseInt(scan.next());
        }

        //check to be sure that the numbers are unique
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(i != j && values[i] == values[j])
                    System.exit(0);
            }
        }

        //get the largest number
        for(int i = 0; i < 3; i++)
        {
            if(values[i] > largestNum)
                largestNum = values[i];
        }

        output = String.format("The largest number that you entered is %d.", largestNum);

        System.out.println(output);
    }
}