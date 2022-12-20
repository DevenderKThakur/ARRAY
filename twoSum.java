
import java.util.*;
import java.lang.*;
import java.io.*;
              //two sum question from leet code 
              //nums =[2,7,11,12]
              //target = 9
class twoSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[3];
		for(int i=0;i<nums.length;i++){
		   nums[i] = sc.nextInt();
		}
		int target =6;
		for(int i=0;i<3;i++){
		   for(int j=i+1;j<3;j++){
		      if(nums[i]+nums[j]==target){
		         System.out.println(i+","+j);
		      }
		   }
		}
	}
}
