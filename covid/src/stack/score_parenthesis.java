package stack;

import java.util.Stack;

public class score_parenthesis {
	static void fun(String s)
	{
		Stack<Character> st=new Stack<>();
        int res=0;
        int balanced=0;
        int res1=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
            	st.push(c);
            }
            else if(c==')')
            {
            	st.pop();
            	res+=1;
            	if(!st.isEmpty())
            	{
            		if(st.peek()=='(')
                	{
                		res=res*2;
                		st.pop();
                		i++;
                	}
            	}
            	
            }  
        }
        System.out.println(res);
	}
	public static void main(String[] args) {
		String s="(()())()";
		fun(s);

	}

}
