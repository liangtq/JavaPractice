public class ArrMax
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1,4,125,3,6,8,28};
		int a = comp(arr);
		System.out.println(a);
		
	}
	
	public static int comp(int[] arr)
	{
		int max = arr[0];
		for(int a=1; a<arr.length;a++)
		{
			if( arr[a]>max)
			{
				max=arr[a];
			}
			
		}
		return max;
	}
}