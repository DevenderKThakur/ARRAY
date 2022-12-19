
import java.util.*;
import java.lang.*;
import java.io.*;

class index2
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
            // declaring the size of the array  
    int n =sc.nextInt();
     int a[] = new int[n];
                  // input from the user 
     for(int i =0;i<n;i++){
        a[i] = sc.nextInt();
     }
                  // print the array 
     for(int i=0;i<n;i++){
        System.out.print(a[i]);
     }
     System.out.println();
	}
	
}
