import java.util.*;
import java.lang.*;
import java.io.*;

// to use linear search in Java to find the position of the value in the array 
class linearSearch
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0;i<n;i++);{
      int n =sc.nextInt();    // size of the array 
      int a[] = new int[n];             // creating a array name a[] 
      for(int i=0;i<n;i++){
          a[i] = sc.nextInt();               // input the value in the array a[]
       }
      int x = sc.nextInt();                  // the element to search in the array 
      for(int i =0;i<n;i++){
          if(a[i]==x){                        
              System.out.println(i+1);
           }  
          if(i==n){                                  // if size of the array == index of the loop then element is not present 
             System.out.println("-1");
          }
        }
    }
	}
}
