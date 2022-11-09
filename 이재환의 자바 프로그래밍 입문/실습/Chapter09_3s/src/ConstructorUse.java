class Book
{
	String title;
	int    price;
	int    num = 1;
	
	//디폴트 생성자에 기능 부여
	Book() 
	{
		title = "자바 프로그래밍";
		price = 30000;
	}
	
	//생성자의 오버로딩
	Book(String t, int p)
	{
		title = t;
		price = p;
	}
	
	//멤버 변수의 값을 출력해준다.
	void print()
	{
		System.out.println("제  목: " + title);
		System.out.println("가  격: " + price);
		System.out.println("주문 수량: " + num);
		System.out.println("합계 금액: " + price * num );
		System.out.println("*******************");
		
	}
	
}

public class ConstructorUse
{

	public static void main(String[] args)
	{
		//Book 타입 == 클래스 타입
		//변수 book
		//new연산자가 객체의 생성자(밑에선 Book())를 이용해서 객체(: 클래스에 기술된대로 구현한 것을 메모리에 탑재해 메모리 주소를 부여한 것)
		//를 생성해준다.
		Book book = new Book(); //디폴트 생성자 사용
		book.print();
		
		Book book2 = new Book("자바 디자인 패턴", 35000); //오버로딩된 생성자 사용
		book2.num  = 10; //객체의 멤버 변수에 직접 값을 대입. 이거 지우면 num = 1그대로 감
		book2.print();
	}

}
//주의할 점: 매개변수가 있는 생성자를 오버로딩해서 만들면 디폴트 생성자를 만들어라고 따로 뜨지 않음(= 자동으로 만들어지지 않음)
//생성자를 오버로딩해서 만들고, 디폴트 생성자는 만들지 않았을 때 아래와 같이 객체를 생성하면 에러가 발생
//Book book = new Book();
//*디폴트 생성자에 아무 기능이 없더라도 디폴트 생성자는 꼭 명시적으로 만들어주자.