public class Ex03_MemoryInHeap2
{

	public static void main(String[] args)
	{
		Book book1 = new Book(); //객체 생성
		book1.num = 10;
		
		Book book2 = book1; //객체에 객체 대입
		
		System.out.println("book1.num :" + book1.num);
		System.out.println("book2.num :" + book2.num);
		System.out.println("-----------------------");
		
		book2.num = 20; // 변수명은 다르지만 실제 같은 객체를 가리키고 있으므로 객체 안의 num 멤버 변수를 출력한 결과는 같다.
		//book1, boo2 두 변수가 가리키는 객체의 멤버 변수의 num의 값이 동시에 변경. 왜냐면 같은 객체를 가리키고 있기 때문에. (id=30) //객체를 참조하는 id값
		
		System.out.println("book1.num :" + book1.num);
		System.out.println("book2.num :" + book2.num);
	}

}
