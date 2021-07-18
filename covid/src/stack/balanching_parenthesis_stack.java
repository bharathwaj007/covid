package stack;

import java.util.Stack;

public class balanching_parenthesis_stack {

	public static void main(String[] args) {
		String str[]={"[","[","]","]"};
		Stack <String> st=new Stack<>();
		for(int i=0;i<str.length;i++)
		{
			if(str[i]=="[")
			{
				st.push(str[i]);
			}
			else if(str[i]=="{")
			{
				st.push(str[i]);
			}
			else if(str[i]=="(")
			{
				st.push(str[i]);
			}
			if(str[i]=="]")
			{
				if(st.peek()=="[")
				{
					st.pop();
				}
			}
			else if(str[i]=="}" )
			{
				if(st.peek()=="{")
				{
					st.pop();
				}
			}
			else if(str[i]==")")
			{
				if(st.peek()=="(")
				{
					st.pop();
				}
			}
		}
		if(st.isEmpty())
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("Not balanced");
		}
	}

}
