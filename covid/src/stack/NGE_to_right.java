package stack;

import java.util.Stack;

public class NGE_to_right {
	static void fun(int arr[])
	{
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=-1;
		}
		int n=arr.length;
		Stack<Integer> st=new Stack<>();
		for(int i=n-1;i>=0;i--)
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
