package stack;

import java.util.Stack;

public class postfix_to_prefix {
	static void fun(String s)
	{
		String res="";
		Stack<String> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				st.push(c+"");
			}
			else
			{
				String s1=st.pop();
				String s2=st.pop();
				String s3=c+s2+s1;
				st.push(s3);
				res=s3;
			}
		}
		System.out.println(res);
	} 
	public static void main(String[] args) {
		String s="AB+CD-*";
		fun(s);

	}

}
