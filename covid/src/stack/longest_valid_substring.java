package stack;

import java.util.Stack;

public class longest_valid_substring {
	static void fun(String s)
    {
		Stack<Integer> st=new Stack<>();
		st.push(-1);
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				st.push(i);
			}
			else if(s.charAt(i)==')')
			{
				st.pop();
				if(!st.isEmpty())
				{
					if(i-st.peek()>max)
					{
						max=i-st.peek();
					}
				}
				else
				{
					st.push(i);
				}
				
			}
		}
		System.out.println(max);
    }
	public static void main(String[] args) {
		String s="())()()";
		fun(s);
	}

}
