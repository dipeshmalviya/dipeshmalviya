//1.
//Write a Java program to find the maximum value in a given array. Define a method findMax that takes an integer array as an argument and returns the maximum //value.
//Code constraints :
//The input array should have at least one element.
//Sample test cases :
//Input 1 :
//5
//10
//20
//30
//40
//50
//Output 1 :
//The maximum value in n the array is: 50

import java.util.Scanner;
public class Q1
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array : ");
    int length = sc.nextInt();
    int []arr = new int[length];
    
     if(arr.length == 0){
       System.out.println("The input array should have at least one element");
       return;
     }

    for(int i = 0; i < length ; i++)
   {
     System.out.print("Enter value : ");
     int val = sc.nextInt();
     arr[i] = val;
   }
   
   int max = findMax(arr);  
   System.out.println("The maximum value in  the array is: "+max);
  
  }

  public static int findMax(int []arr)
  {
    
     
     int max = 0;

    for(int i = 0 ; i < arr.length; i++)
    {
      if(arr[i] > max)
      {
          max = arr[i];
 
      }
    }
    return max;

  }

}