public class Test
{
	public static void main(String[] args)
	{
			int[] shuzu = new int[] {1,3,4,5,2,6};
			printArr(shuzu);
	}
	
	public static void printArr(int[] arr)
	{
		System.out.print("[");
		for(int a=0;a<arr.length;a++)
		{
			if(a!=arr.length-1)
			 System.out.print(arr[a]+", ");
		 	else
		 	 System.out.print(arr[a]+"] \n");
		}
	}

}