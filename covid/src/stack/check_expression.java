package stack;

import java.util.Stack;

public class check_expression {
	static void fun(String exp,String exp1)
	{
		char c=' ';
		int ind=0;
		for(int i=0;i<exp.length()-1;i++)
		{
			char c1=exp.charAt(i);
			char c2=exp.charAt(i+1);
			if(c1=='+' && c2=='(' || c1=='-' && c2=='(')
			{
				c=c1;
				ind=i+1;
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		String exp1 = "-(a+b+c)";
        String exp2 = "-a-b-c";
        fun(exp1,exp2);
	}

}
