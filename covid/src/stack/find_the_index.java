package stack;

import java.util.Stack;

public final class find_the_index {
	static void fun(String s,int index)
	{
		s=s.replaceAll("[A-Z+-]","");
		System.out.println(s);
		int count=0;
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				st.push(i);
			}
			if(s.charAt(i)==')')
			{
				if(st.peek()==index)
				{
					count++;
					System.out.println(i);
					break;
				}
				else
				{
					st.pop();
				}
			}
		}
		if(count==0)
		{
			System.out.println("not balanced");
		}
	}
	public static void main(String[] args) {
		String s="((()())()";
		int index=0;
		fun(s,index);
	}

}
