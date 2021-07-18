package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class delete_element_smaller_than_nxt {
	static void fun(int arr[])
	{
		int k=2;
		Stack<Integer> st=new Stack<>();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(st.isEmpty())
			{
				st.push(arr[i]);
			}
			else
			{
				while(!st.isEmpty() && k!=0)
				{
					if( st.peek()<=arr[i])
					{
						st.pop();
						k--;
					}
					else
					{
						break;
					}
				}
				st.push(arr[i]);
			}
		}
		while(!st.isEmpty())
		{
			list.add(st.pop());
		}
		Collections.reverse(list);
		System.out.println(list);
	}
	public static void main(String[] args) {
		int arr[]= {20,10,25,30,40};
		fun(arr);

	}

}
