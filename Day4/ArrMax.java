/*
compare the elements in an array by comparing the index
*/
public class ArrMax
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1,4,125,3,6,8,28};
		int a = comp(arr);
		int b = getMin(arr);
		//double c = comp(arr);
	   System.out.println("Max is "+a);
	   System.out.println("Min is "+b);
		
	}
	
	public static int comp(int[] arr)
	{
		int max = 0;
		for(int a=1; a<arr.length;a++)
		{
			if( arr[a]>arr[max])
			{
				max=a; // record the max index
			}
			
		}
		return arr[max]; // return the number corresponds to the index
	}
	
	public static int getMin(int[] arr)
	{
		int min = 0;
		for(int a=1; a<arr.length;a++)
		{
			if( arr[a]<arr[min])
			{
				min=a; // record the max index
			}
			
		}
		return arr[min]; // return the number corresponds to the index
	}
	
	/*override, since same function with comp, but diff type of return value
	public static double comp(double[] arr)
	{
		
	}
	*/
}