//3.Write a Java program to concatenate two given arrays. Define a method concatenateArrays that takes two integer arrays as arguments and returns a new array //containing all elements of the first array followed by all elements of the second array.
//Code constraints :
//The input arrays can be of any length, including empty.
//Sample test cases :
//Input 1 :
//int[] array1 = {1, 2, 3};
//int[] array2 = {4, 5, 6};
//Output 1 :
//1 2 3 4 5 6 


import java.util.Scanner;
public class Q3
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of 1 array : ");
    int length1 = sc.nextInt();
    int []arr1 = new int[length1];

    for(int i = 0; i < arr1.length ; i++)
   {
     System.out.print("Enter value : ");
     int val1 = sc.nextInt();
     arr1[i] = val1;
   }

  System.out.print("Enter the length of 2 array : ");
    int length2 = sc.nextInt();
    int []arr2 = new int[length2];

   for(int i = 0; i < arr2.length ; i++)
   {
     System.out.print("Enter value : ");
     int val2 = sc.nextInt();
     arr2[i] = val2;
   }

   int []concateArr = concateArray(arr1,arr2);  
   System.out.println("Printing concated Array Elements");
  
   for(int i = 0; i < concateArr.length ; i++)
   {
     System.out.print(concateArr[i]+" ");
   }
  
  }

  public static int[] concateArray(int []arr1,int []arr2)
  {
     int concateArr[] = new int[arr1.length + arr2.length];
    for(int i = 0 ; i < arr1.length; i++)
    {  
        concateArr[i] = arr1[i]; 
    }
     int j = arr1.length;
     for(int i = 0 ; i < arr2.length; i++)
    {  
        concateArr[j] = arr2[i];
        j++; 
    }
    return concateArr;

  }

}
