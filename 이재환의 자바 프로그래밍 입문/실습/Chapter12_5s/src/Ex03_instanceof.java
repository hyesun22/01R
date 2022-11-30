interface Cry
{
	void cry();
}

class Cat implements Cry
{
	public void cry() 
	{
		System.out.println("야옹~");
	}

}

class Dog implements Cry
{
	public void cry() 
	{
		System.out.println("멍멍!");
	}
}

public class Ex03_instanceof {

	public static void main(String[] args) {
		Cry test1 = new Cat();
		//Cry test1 = new Dog();
		
		//test1에 있는 참조 값이 Cat의 객체를 가리키는지 Dog의 객체를 가리키는지 조사하여 그에 따른 코드를 진행한다.
		//instanceof 연산자는 결국 다형성을 잘 사용하려고 사용하는 연산자이다.
		if(test1 instanceof Cat)
		{
			test1.cry(); //야옹~
		}
		else if (test1 instanceof Dog)
		{
			System.out.println("고양이가 아닙니다.");
		}

	}

}
