public class ArrayTest2
{
	public static void main(String[] args)
	{
		toBin(12);
		System.out.println(Integer.toBinaryString(12));
		toHex(234);
	}
	public static void toBin(int a)
	{
		StringBuffer sb = new StringBuffer();
		while(a>0)
		{
			//System.out.println(a % 2);
			sb.append(a%2);
			a = a / 2;
		}
			System.out.println(sb.reverse());
	}
	
	//decimal to hex
	public static void toHex(int a)
	{
		StringBuffer sb = new StringBuffer();
		for(int x = 0; x<8;x++)
		{
			int temp = a & 15;
			if(temp>9)
			{
			//System.out.println((char)(temp-10+'A'));
			sb.append((char)(temp-10+'A'));
			}
			else
			//System.out.println(temp);
			sb.append(temp);
		
			a = a>>>4;
				
		}
		System.out.println(sb.reverse());
	}
	

}