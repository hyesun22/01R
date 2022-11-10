public class Ex02_MemoryInHeap1
{

	public static void main(String[] args) //메서드가 호출되면 지역변수, 매개변수가 프레임 형태로 생성되어 스택영역으로 쌓였다가 사라집니다.
	{
		Book book  = new Book(); //이때 객체 안의 클래스 멤버 변수인 num은 따로 값을 넣지 않았지만 0으로 초기화되어있다.
		Book book2 = new Book();
		
		book.num = 1;
		book2.num = 2;
		
		System.out.println(book.num);
		System.out.println(book2.num);
		
		book = null; //스택 영역의 변수(book, boo2)와 힙 영역의 객체 간에 참조 관계를 끊는것. 하지만 힙 영역의 객체(public class Book 관련)
		               // 가 사라지는 것이 아님. 스택 영역에 있는 변수에 더는 힙 영역의 객체를 참조하지 않는다고 표시만 한 것이다.
		book2 = null;
	} //스택 영역의 모든 프레임이 사라지면서 프로그램이 종료됨. 그러면 이 프로그램에서 만든 힙 영역의 모든 객체(new연산자에 의해 동적으로 생성)는
	  //가비지 컬렉터가 제거하지 않아도 자동으로 제거된다.
}
