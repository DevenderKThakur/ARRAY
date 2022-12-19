import java.util.*;
import java.lang.*;
import java.io.*;

/* find the sum of the value in the array  */
class sumArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();  // number of test case 
		
		for(int j=0;j<t;j++){
		   int n =sc.nextInt();      // size of the array 
		   int a[] = new int[n];           
		      for(int i=0;i<n;i++){
		         a[i] = sc.nextInt();
		      }
		      int sum = 0;
		      for(int i =0;i<n;i++){
		         sum = sum+a[i];
		      }
		      System.out.println(sum);
		}
	}
}
