package stack;

import java.util.Stack;

public class find_depth {
	static void fun(String s)
	{
		int max=Integer.MIN_VALUE;
		int count=0;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='(')
			{
				count++;
				st.push(c);
			}
			else if(c==')')
			{
				st.pop();
				max=Math.max(count, max);
				count=0;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		String s="((())(((()))))";
		fun(s);
	}

}
