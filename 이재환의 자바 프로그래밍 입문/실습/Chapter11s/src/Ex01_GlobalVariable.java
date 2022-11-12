class Cat {
	static int a = 5;  //static 변수(static변수 및 static메서드는 프로그램 시작 전에 로드되고 프로그램 종료 시 소멸)
	                   //이 static변수는 모든 클래스에서 다 접근해서 사용할 수 있기 때문에 전역 변수(global)라고도 부른다.
	int num      = 3;  //인스턴스 변수
	
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
		cat1.num = 1;  //*1.num이 3에서 1로 바뀜
		cat1.a = 10;   //*A. a가 5에서 10으로 바뀜
		cat1.printValue(20);  //함수 호출  //*2.num이 1에서 20으로 바뀜
		System.out.println(cat1.num); //20
		System.out.println(cat1.a);  // 10
		System.out.println("-------------------------");
		
		Cat cat2 = new Cat();
		cat2.num = 2; //*1.num이 3에서 2로 바뀜
		cat2.a = 11;  //*A. a가 10에서 11로 바뀌는데 cat1.a도 마찬가지로 이렇게 변함(이것이 전역변수)
		cat2.printValue(10); //*2. num이 2에서 10으로 바뀜
		System.out.println(cat2.num);  //10
		System.out.println(cat2.a);  // 11
		System.out.println(cat1.a);  // 11*
	}

}
