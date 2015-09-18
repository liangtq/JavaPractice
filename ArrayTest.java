/*
Given the Array {5,1,6,4,2,8,9}, sort 
*/

class ArrayTest
{
	public static void main(String[] args)
	{
		int[] arr = {5,1,6,4,2,8,9};
		printArr(arr);
		sort(arr);//after sort the array, need to print it out, 打印数组，遍历循环，定义method
		printArr(arr);
		//System.out.println();
	}
	
	public static void sort(int[] arr)
	{
		//int min = 0;
		int temp;
		for(int a=0;a<arr.length-1;a++)
		{
			for(int b=a+1;b<arr.length;b++)	
			{
				if (arr[a]>arr[b])
				{
					temp =arr[b];
					arr[b]=arr[a];
					arr[a]=temp;
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