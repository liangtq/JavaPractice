/*
this看上去是用于区分局部变量和成员变量同名的情况。
this为什么可以解决这个问题？
this到底代表的是什么？
this的特点：
this代表本类对象，到底代表哪一个呢？
	this代表它所在函数所属对象的引用
	this在哪个函数里，就代表哪个函数所属的对象
	简单说：哪个对象在调用this所在函数，this就代表哪个对象，this可能是p或者p1。
	变量有同名情况时候，必须加this
	类（class）里成员被使用，全是由对象来完成，本类里的对象是this，this是运行的对象
this的应用：
	当定义类中功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象。谁后期调用我，我就代表谁
	但凡本类功能内部使用到了本类对象，那么都用this表示
this就是代表对象，找对象。
*/

class Person
{
	private String name;
	private int age;
	
	Person(int age)
	{
		this.age = age;
	}
	
	Person(String name)
	{
		this.name = name;
		//System.out.println("B: name= "+name+",,age is "+age);
	}
	
	Person(String name,int age)
	{
		name = name;
		this.age = age;
		//System.out.println("C: name= "+name+",,age is "+age);
	}
	
	public void speak()
	{
		System.out.println("name= "+this.name+",,age is "+this.age);
		this.show();//也可以是show()
	}
	
	public void show()
	{
		System.out.println(this.name);
	}
	/*
	需求：给人定义一个用于比较年龄是否相同的功能，也就是是否是同龄人。
	*/
	public boolean ageComp(Person p)//人与人比，不是人与年龄比
	{
		//if(this.age == p.age ) //this是p1，因为p1在调用这个函数，p接收的是p2的值
			return (this.age == p.age);
	}
}

class PersonDemo1
{
	public static void main(String[] args)
	{
		Person p1 = new Person(20);
		Person p2 = new Person(50);
		boolean b = p1.ageComp(p2);
		System.out.println(b);
		//p.speak();
		//p1.speak();
		
	}
}