package myfirstMaven.com;

public class Cat extends Dog {
void meow()
{
	System.out.println("Meowing");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat obj=new Cat();
obj.meow();
obj.bark();
obj.eat();

	}

}
