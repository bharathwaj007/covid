package stack;

import java.util.Stack;

public class delete_middle_ele {
	static void fun(int arr[])
	{
		int count=0;
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			if(count==arr.length/2)
			{
				count++;
			}
			else
			{
				st.push(arr[i]);
				count++;
			}
			
		}
		System.out.println(st.contains(1));
//		int m=st.size()/2;
//		System.out.println(m);
		while(!st.isEmpty())
		{
			System.out.print(st.pop()+" ");
			count++;
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		fun(arr);

	}

}
