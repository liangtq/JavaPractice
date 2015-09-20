public class ArrayTest3
{
	public static void main(String[] args)
	{
		toHex(60);
	}
	
	/*
		0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F == HEX
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 == index
		查表法：将所有的元素临时存储起来，建立对应关系
		每一个&15后的值作为索引去查建立好的表，就可以找到对应的元素
		这样比-10+'a'简单的多
		
		这个表怎么建立？
		可以通过数组的形式来定义
	*/
	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
		                'C','D','E','F'};
		// 定义一个临时容器， 数组
		
		char[] arr = new char[8];
		while(num != 0)
		{
			int pos = 0;
			int temp= num & 15;
			//System.out.println(chs[temp]);
			arr[pos]=chs[temp];
			pos++;
			num = num >>>4;
		//储存数据的arr数组遍历
		for(int a = pos-1; a>=0;a--)
		{
		System.out.print(arr[a]+",");
		}
		}
	}
}