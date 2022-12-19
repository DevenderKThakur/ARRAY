import java.util.*;
import java.lang.*;
import java.io.*;
  // creating a function to take input from the user 
  public static int[] takeInput(){   // as the function is going to return int array 
    Scanner sc = new Scanner(System.in);
    int input[] = new int[10];
    for(int i =0;i<input.length;i++){
       input[i] = sc.nextInt();
    }
    return input;   // return array 
  }
     // function is been created to print  the array 
  public static void print(int input[]){
     for(int i =0;i<input.length;i++){
        System.out.print(input[i]);
     }
     System.out.println();
  }

class index3
{
	public static void main (String[] args) throws java.lang.Exception
	{
      int a[] = takeInput();
      print(a);
	}
	
}
