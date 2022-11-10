class Student1
{
	String name; //접근제한상태: 디폴트. 같은 패키지 안의 클래스에서 언제든지 변수에 접근해 사용할 수 있다.
	int age;
}

class Student2
{
	public String name; //외부 클래스 어디에서나 접근 가능
	private int age; //같은 클래스 내부에서만 접근 가능. & 게터세터를 활용해 오류를 받을 수 있음. => 이러한 클래스설계를 '정보 은닉화'라 한다. 
	// private 멤버변수에 값을 대입하는 메서드를 setter & 값을 가져오는 메서드를 getter라고 부른다.
	
	public Student2 (String name, int age) //이대로 가다가는 매개변수명(생성자 또는 메서드 호출시 값을 담아 사용하는 변수. 여기선 후자)과
	//멤버변수명(: 클래스 내부에 선언하며 해당 클래스의 특성을 나타냄.)이 겹쳐져버림
	{
		this.name = name; //그래서 생성자나 게터, 세터 등의 메서드에서 this를 사용합니다. (얘네는 멤버변수임을 구별해주기 위해)
		this.age = age;
	}
	
	public int getAge() //getter
	{
		return age;
	}
	
	public void setAge(int age) //게터세터 이용하는 이유. 부적절한 값의 대입을 막을 수 있다.
	{
		if ( age < 0 || age > 150)
		{
			System.out.println("나이가 부적절합니다.");
			this.age = 0;
			return;
		}
		this.age = age;
	}
}


public class PrivateUse
{

	public static void main(String[] args)
	{
		Student1 student1 = new Student1();
		student1.name = "홍길동";
		student1.age  = -20;
		System.out.printf("%s의 나이는 %d살입니다\n", student1.name, student1.age);
		
		Student2 student2 = new Student2("전우치", 20); 
		student2.name = "손오공";
		//student2.age = -10; -> 에러. (private 멤버변수이기에)
		student2.setAge(-10); //세터를 사용한 접근(O)
		int age = student2.getAge();
		System.out.printf("%s의 나이는 %d살입니다.\n", student2.name, age);
		
	}

}
