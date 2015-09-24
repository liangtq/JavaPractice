/*
描述汽车：汽车的 属性+行为
*/

class Car
{
	//属性就是class中的变量
	String color = "red";
	int tire = 4;
	//行为就是class中的函数（方法）
	void run()
	{
		System.out.println("color is "+color+"tire is "+tire);
	}
}

class CarDemo
{
	public static void main(String[] args)
	{
		//生产汽车
		/*
		Car c = new Car();
		c.color = "blue";
		
		Car c1 = new Car();
		c1.run();
		*/
		Car q = new Car();
		show(q);
		
	}
	// 需要对车辆进行改装，将来的车改成黑色，三个轮胎
	public static void show(Car c)
	{
		c.tire = 3;
		c.color ="black";
		c.run();
	}
}