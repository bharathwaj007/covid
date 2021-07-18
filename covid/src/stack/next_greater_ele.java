package stack;

import java.util.Stack;

public class next_greater_ele {

	public static void main(String[] args) {
		int arr[]= {13, 7, 6, 12};
		Stack<Integer> st=new Stack<>();
		st.push(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			if(st.peek()<arr[i])
			{
				System.out.println(st.pop()+"-->"+arr[i]);
				while(!st.isEmpty())
				{
					if(st.peek()<arr[i])
					{
						System.out.println(st.pop()+"-->"+arr[i]);
					}
					else
					{
						break;
					}
				}
				st.push(arr[i]);
			}
			else
			{
				st.push(arr[i]);
			}
		}
		while(!st.isEmpty())
		{
			System.out.println(st.pop()+"-->"+ -1);
		}
		
	}

}
