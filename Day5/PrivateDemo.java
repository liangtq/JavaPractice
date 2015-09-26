/*
private 只在本类中有效，外界即使建立了对象也不可能访问到
但是人应该有年龄，就需要在Person中提供对应的age访问方式
年龄，姓名等用法可用：setAge（void...(int a)不用返回值，但是有参数）, getAge(有返回值 int..，但是不需要参数) 对外提供方法
一个属性通常对应两个方法，set和get

注意：
私有仅仅是封装的一种表现形式，私有是最小权限
封装不是私有。

之所以对外提供访问方式，就是因为可以在访问方式中加入逻辑判断等语句，对访问的数据进行操作，提高代码的健壮性
封装原则：
将不再对外提供的内容都隐藏起来
把属性都隐藏，提供公共方法对其访问
*/

class Person
{
	private int age;//age已被封装
	
	public void setAge(int a)
	{
		if(a>0 && a<130)
		{
			age = a;
			speak();
		}
		else
			System.out.println("nono");
		
		
	}
	public int getAge()
	{
		
		return age;
		
	}
	void speak()
	{
		System.out.println("my age is "+age);
	}
}

class PrivateDemo
{
	public static void main(String[] args)
	{
		Person p = new Person();
		//p.age = 20;
		p.setAge(70);
		//p.speak();
	}
}