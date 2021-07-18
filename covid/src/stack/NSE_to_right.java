package stack;

import java.util.Arrays;
import java.util.Stack;

public class NSE_to_right {
	static void fun(int arr[])
	{
		int arr1[]=new int[arr.length];
		Arrays.fill(arr1, -1);
		Stack<Integer> st=new Stack<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			while(!st.isEmpty())
			{
				if(st.peek()<=arr[i])
				{
					arr1[i]=st.peek();
					break;
				}
				else
				{
					st.pop();
				}
			}
			st.push(arr[i]);
		}
		for(int i:arr1)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {7,1,4,5,3};
		fun(arr);
	}
}
