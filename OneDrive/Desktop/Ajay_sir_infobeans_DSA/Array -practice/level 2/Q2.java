//2.Write a Java program to reverse a given array. Define a method reverseArray that takes an integer array as an argument and returns a new array with the //elements in reverse order.

import java.util.Scanner;
public class Q2
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array : ");
    int length = sc.nextInt();
    int []arr = new int[length];

    for(int i = 0; i < length ; i++)
   {
     System.out.print("Enter value : ");
     int val = sc.nextInt();
     arr[i] = val;
   }
   
   int []reverseArr = reverseArray(arr);  
   System.out.println("Printing the new array whice reverse");
  
   for(int i = 0; i < length ; i++)
   {
     System.out.print(reverseArr[i]+" ");
   }
  
  }

  public static int[] reverseArray(int []arr)
  {
     int reverseArr[] = new int[arr.length];
     int j = 0;
    for(int i = arr.length-1 ; i >= 0; i--)
    {
        reverseArr[j] = arr[i];
        j++;
    }
    return reverseArr;

  }

}
