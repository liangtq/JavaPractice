/*
构造函数不用定义返回值,无需void。不可以写return语句
构造函数对象一建立，就会调用与之对应的构造函数
构造函数的作用，可以用于给对象进行初始化
细节：当一个类中没有定义构造函数时，那么系统会默认给该类加入一个空参数的构造函数
当在类中自定义了构造函数后，系统就不在帮助加构造函数了
构造函数和一般函数在写法上有不同，在运行上也有不同
构造函数在对象一建立就运行，给对象初始化，
而一般方法是对象调用才执行，是给对象添加对象具备的功能

一个对象建立，构造函数只运行一次，而一般方法可以被该对象调用多次，想什么时候用就什么时候用，但是一定要被调用才执行
方法必然被对象调用

什么时候定义构造函数：
当分析事物时，该事物存在具备一些特性或者行为，将这些内容定义在构造函数中。需不需要未知内容参与运算？
需要就写参数，不需要就不写

构造代码块中定义的是不同对象共性的初始化内容。
*/

class Person
{
	private String name;
	private int age;
	
	
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	Person()
	{
		System.out.println("A: name= "+name+",,age is "+age);
		//cry();
	}
	// Person(());
	Person(String n)
	{
		name = n;
		System.out.println("B: name= "+name+",,age is "+age);
		//cry();
	}
	
	Person(String n,int a)
	{
		name = n;
		age = a;
		System.out.println("C: name= "+name+",,age is "+age);
		//cry();
	}
	
	public void cry()
	{
		System.out.println("cry");
	}
	/*
	构造代码块：给对象进行初始化。
	对象一建立就运行，而且优先于构造函数执行。
	与构造函数的区别：
	构造代码块是给所有对象进行统一初始化。
	而构造函数是给对应的对象初始化
	*/
	{
		//System.out.println("person code cry");
		cry();
	}
}

class PersonDemo
{
	public static void main(String[] args)
	{
		Person p1 = new Person();//初始化的cry
		//p1.cry();//cry的第二次
		Person p2 = new Person("lisi");
		
		//Person p3 = new Person("zhangsan",4);
		//p2.setName("libushi");//想改名
		//p2.setName("LISI");//可以改多次，最后一次为准
		//System.out.println(p2.getName());
		//new Person();//调用几次，执行几次
	}
}