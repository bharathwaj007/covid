package stack;

import java.util.*;
import java.util.Stack;

public class next_Greater_freq {
	static void fun(int arr[])
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		int j=0;
		int arr1[]=new int[arr.length];
		int arr2[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[j]=map.get(arr[i]);
			j++;
		}
		System.out.println(Arrays.toString(arr1));
		Stack<Integer> st=new Stack<>();
		st.push(arr1[0]);
		int k=0;
		for(int i=1;i<arr1.length;i++)
		{
			if(st.peek()<arr1[i])
			{
				arr2[k]=arr[arr1[i]];
				k++;
				while(!st.isEmpty())
				{
					if(st.peek()<arr1[i])
					{
						arr2[k]=arr[arr1[i]];
						k++;
					}
					else
					{
						break;
					}
				}
				st.push(arr1[i]);
				}
			else
			{
				st.push(arr1[i]);
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
	public static void main(String[] args) {
		int arr[]= {1, 1, 2, 3, 4, 2, 1};
		fun(arr);

	}

}
