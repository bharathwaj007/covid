package stack;

import java.util.Stack;

public class postfix_to_infix {
	static void fun(String s)
	{
		Stack<String> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				st.push(s.charAt(i)+"");
			}
			else
			{
				String st1=st.pop();
				String st2=st.pop();
				String temp="("+st2+s.charAt(i)+st1+")";
				st.push(temp);
			}
		}
		System.out.println(st);
		System.out.println(st.pop());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC++";
		fun(s);

	}

}
