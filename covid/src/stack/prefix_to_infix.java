package stack;

import java.util.Stack;

public class prefix_to_infix {
	static void fun(String s)
	{
		Stack<String> st=new Stack<>();
		for(int i=s.length()-1;i>=0;i--)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				st.push(s.charAt(i)+"");
			}
			else
			{
				String st1=st.pop();
				String st2=st.pop();
				String temp="("+st1+s.charAt(i)+st2+")";
				st.push(temp);
			}
		}
		System.out.println(st);
		System.out.println(st.pop());
	}
	public static void main(String[] args) {
		String s="*+AB-CD";
		fun(s);

	}

}
