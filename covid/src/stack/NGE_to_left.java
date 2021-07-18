package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NGE_to_left {
	static void fun(int arr[])
	{
		int arr1[]=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		Arrays.fill(arr1, -1);
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty())
			{
				if(st.peek()>=arr[i])
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
		int arr[]= {5,1,2,4};
		fun(arr);

	}

}
