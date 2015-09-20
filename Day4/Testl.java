Public class Testl
{
	public static viod main(String[] args)
	{
		int[] arr = {1,2,5,3,6,7,23};
		int a = getMax(arr);
		System.out.println("Max is "+a);
	}
	
	public static int getMax(int[] arr)
	{
		//int index = 0;
		int max = arr[0];
		for(int a=1; a<arr.length; a++)
		{
			if(arr[a]>max)
			{
				max = arr[a];
			}
		} 
		//System.out.println("Max is "+max);
		return max;
		
	}
}
