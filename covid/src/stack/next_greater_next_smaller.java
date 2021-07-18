package stack;
import java.util.*;
public class next_greater_next_smaller {
	static void fun(int arr[],int n)
	{
		int ls[]=new int[n];
        int rg[]=new int[n];
        
        int j=0;
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<n;i++)
        {
            if(arr[i]<st.peek())
            {
                ls[j]=st.pop();
                j++;
                while(!st.isEmpty())
                {
                    if(arr[i]<st.peek())
                    {
                        ls[j]=st.pop();
                        j++;
                    }
                    else
                    {
                        break;
                    }
                }
                st.push(arr[i]);
            }
            else
            {
                st.push(arr[i]);
            }
        }
        while(!st.isEmpty())
        {
            ls[j]=0;
            j++;
        }
        System.out.println(Arrays.toString(ls));
	}
	public static void main(String[] args) {
		int arr[]= {2,1,8};
		int n=arr.length;
		fun(arr,n);

	}

}
