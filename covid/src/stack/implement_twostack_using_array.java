package stack;

public class implement_twostack_using_array {
	static int arr[]=new int[6];
	static int top1=-1;
	static int top2=arr.length/2-1;
	public static boolean push(int x)
	{
		if(top1==arr.length/2-1)
		{
			System.out.println("stack overflow");
			return false;
		}
		else
		{
			arr[++top1]=x;
			return true;
		}
	}
	public static void pop()
	{
		if(top1==-1)
		{
			System.out.println("stack underflow");
		}
		else
		{
			int x=arr[top1--];
		}
	}
	public static void display()
	{
		for(int i=top1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void push1(int x)
	{
		if(top2==arr.length-1)
		{
			System.out.println("stack overflow");
		}
		else
		{
			arr[++top2]=x;
		}
	}
	public static void pop1()
	{
		if(top2==arr.length/2-1)
		{
			System.out.println("stack underflow");
		}
		else
		{
			int x=arr[top2--];
		}
	}
	public static void display1()
	{
		for(int i=top2;i>=arr.length/2;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void array_display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		push(5);
		push(6);
		push(7);
		push1(9);
		push1(10);
		push1(11);
		pop();
		pop();
		pop();
		pop();
		pop1();
		pop1();
		pop1();
		pop1();
		display();
	}

}
