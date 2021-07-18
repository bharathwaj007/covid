package stack;

import java.util.Stack;

public class prefix_to_postfix {
	static void fun(String s)
	{
		String res="";
		Stack<String> st=new Stack<>();
		for(int i=s.length()-1;i>=0;i--)
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
				String s3=s1+s2+c+"";
				res=s3;
				st.push(s3);
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		String s="*+AB-CD";
		fun(s);

	}

}
