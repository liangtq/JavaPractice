/*
This is a bubble sort program 
*/
public class SortArr
{
	public static void main(String[] args)
	{
		int[] arr = {1,3,2,64,34,234,512};
		printArr(arr);
		sort(arr);
		printArr(arr);
		
	}
	
	public static void sort(int[] arr)
	{
		int min;
		int temp;
		for(int a=0; a<arr.length-1;a++) //一共比较的轮数，形式不变
			{
			for(int b=0; b<arr.length-a-1;b++) // -a is to reduce the compared element each time
			{									//每次从0开始比，所以b=0 always begin with 0
				if(arr[b+1]<arr[b])
				{
					temp=arr[b];
					arr[b]=arr[b+1];
					arr[b+1]=temp;	
				}
			}
			}
	}
	public static void printArr(int[] arr)
	{
		System.out.print("[");
		for (int a=0;a<arr.length;a++)
		{
			if (a != arr.length-1)
			{
			System.out.print(arr[a]+", ");
			}
			else
			{
			System.out.println(arr[a]+"]");
			}
		}
	}
}
