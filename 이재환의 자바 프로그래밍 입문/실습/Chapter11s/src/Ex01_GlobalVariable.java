class Cat {
	static int a = 5;  //static 변수(static변수 및 static메서드는 프로그램 시작 전에 로드되고 프로그램 종료 시 소멸)
	int num      = 3;
	
	void printValue(int num) {
		this.num = num;
		System.out.println("num:" + this.num);
		System.out.println("a:" + a);
	}
}

public class Ex01_GlobalVariable
{

	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + "," + num2);
		
		Cat cat1 = new Cat(); //스택 영역에 생성
		cat1.num = 1;
		cat1.a = 10;
		cat1.printValue(20);  //함수 호출
		System.out.println(cat1.num);
		System.out.println(cat1.a);
		System.out.println("-------------------------");
		
		Cat cat2 = new Cat();
		cat2.num = 2;
		cat2.a = 11;
		cat2.printValue(10);
		System.out.println(cat2.num);
		System.out.println(cat2.a);
		System.out.println(cat1.a);
	}

}
