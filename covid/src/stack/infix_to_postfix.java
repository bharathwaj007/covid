package stack;

import java.util.Stack;

public class infix_to_postfix {
	static int prec(char c)
	{
		switch(c)
		{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
		}
		return -1;
	}
	static void fun(String s)
	{
		String res="";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetterOrDigit(s.charAt(i)))
			{
				res+=s.charAt(i);
			}
			else if(s.charAt(i)=='(')
			{
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)==')')
			{
				while(!st.isEmpty() & st.peek()!='(')
				{
					res+=st.pop();
				}
				st.pop();
			}
			else
			{
				while(!st.isEmpty() && prec(s.charAt(i)) <= prec(st.peek()))
				{
					res+=st.pop();
				}
				st.push(s.charAt(i));
			}
		}
		while(!st.isEmpty())
		{
			if(st.peek()=='(')
			{
				System.out.println("Invalid exp");
				break;
			}
			else
			{
				res+=st.pop();
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		String s="a+(b+c";
		fun(s);
	}

}
