package stack;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern_matching {

	public static void main(String[] args) {
		String a="ABCMNBCHGABGCABC";
		a=new StringBuffer(a).reverse().toString();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<a.length();i++)
		{
			st.push(a.charAt(i));
		}
		int count=0;
		String s="";
		String s1="";
		while(!st.isEmpty())
		{
			s+=st.pop()+"";
			s1=s;
			s=s.replaceAll("ABC", "");
			if(s1.length()!=s.length())
			{
				count++;
			}
		}
		System.out.println(count);
		
		String z="prabhat kumar singh";
		Pattern p=Pattern.compile("\\b[a-zA-Z](?=.*)");
		Matcher m=p.matcher(z);
		while(m.find())
		{
			System.out.print(m.group()+" ");
		}
	}

}
