class FindArr
{
	public static void main(String[] args)
	{
		int[] arr ={1,2,4,5,7,8,9,12};
		//int a = search(arr,234);
		//System.out.println(a);
		int b = halfSearch(arr,6);
		System.out.println("index is "+b);
		int c = halfSearch_2(arr,7);
		System.out.println("index is "+c);
		int d = getIndex(arr,6);
		System.out.println("index is "+d);
	}
	public static int search(int[] arr,int a)
	{
		for (int b=0;b<arr.length;b++)
		{
			if (arr[b]==a)
			{
				return b;
			}
		}
				return -1;
	}
	
	public static int halfSearch(int[] arr, int key)
	{
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max)/2;
		while(key != arr[mid])
		{
			if(key>arr[mid])
			{
				min = mid + 1;
			}
			else if(key<arr[mid])
			{
				max = mid -1;
			}
			
			if(min==max)
				return -1;
			mid = (min + max)/2;
		}
			return mid;
	}
	public static int halfSearch_2(int[] arr, int key)
	{
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max)/2;
		
		while(min<=max)
		{
			mid = (max+min)>>1;// divided by 2
			if(key>arr[mid])
				min = mid+1;
			else if(key<arr[mid])
				max = mid -1;
			else
				return mid; 
			
		}
			return -1;
	}
	// insert a number to array to ensure array still in order
	public static int getIndex(int[] arr, int key)
	{
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max)/2;
		
		while(min<=max)
		{
			mid = (max+min)>>1;// divided by 2
			if(key>arr[mid])
				min = mid+1;
			else if(key<arr[mid])
				max = mid -1;
			else
				return mid;
			
		}
				return min; // if not found, return to min
	}
}