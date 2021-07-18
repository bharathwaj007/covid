package stack;

import java.util.Scanner;

class stack
{
	Scanner sc=new Scanner(System.in);
	static int MAX=1000;
	int top;
	int arr[]=new int[MAX];
	stack()
	{
		top=-1;
	}
	boolean isempty()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");	
		}
		return false;
	}
	public boolean push()
	{
		if(top>=MAX-1)
		{
			System.out.println("stack overflow");
			return false;
		}
		else
		{
			System.out.println("enter the element");
			int x=sc.nextInt();
			arr[++top]=x;
			System.out.println(x+" is pushed into stack");
			return true;
		}
	}
	public void pop()
	{
		if(top<0)
		{
			System.out.println("stack underflow");
		}
		else
		{
			int x1=arr[top--];
			System.out.println(x1+" is popped from stack");
		}
	}
	public void peek()
	{
		if(top<0)
		{
			System.out.println("stack underflow");
		}
		else
		{
			int x=arr[top];
			System.out.println(x);
		}
	}
	public void display()
	{
		if(top<0)
		{
			System.out.println("stack is empty");
		}
		else
		{
			for(int i = top; i>=0;i--)  
	        {  
	            System.out.println(arr[i]);  
	        }
		}
	}
}
public class stack_imple_using_arr {

	public static void main(String[] args) {
		stack s=new stack();
		Scanner sc1=new Scanner(System.in);
		System.out.println("------------stack implementation-----------");
		int choice=0;
		while(choice!=5)
		{
			System.out.println("ENTER YOU CHOICE:"
					+ "1. PUSH "
					+ " 2.POP "
					+ "3.PEEK "
					+ "4.DISPLAY ");
			System.out.println("enter choice");
			choice=sc1.nextInt();
			switch(choice)
			{
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.peek();
				break;
			case 4:
				s.display();
				break;
			case 5:
				System.out.println("EXIT.........");
				break;
			}
		}

	}

}
