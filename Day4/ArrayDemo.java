class ArrayDemo
{
	public static void main(String[] args)
	{
		//int[] arrr = new int[3];
		//int[][] arr = new int[3][4];// 2D array
		//System.out.println(arr[0][1]);
		//int[][] arr = new int[3][];
		
		/*arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[2];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		*/
		
		int[][] arr = {{1,2,3,},{3,5,2},{6,8,4,7}};
		int sum = 0;
		for(int a= 0; a<arr.length ;a++)
		{
			for(int b=0; b<arr[a].length;b++)
			{
				sum = sum + arr[a][b];
			}
		}
		System.out.println("sum is "+sum);
		
	}
	
	
}