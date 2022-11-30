//매번 패키지명을 붙여서 사용하게 되면 불편. 클래스명이 같아서 충돌이 일어나는 경우가 아니라면 임포트를 해서 사용하면 됨
//사용하고자 하는 클래스를 패키지명하고 같이 써서 임포트를 한다. 임포트한 클래스는 패키지명 없이 사용할 수 있다.
//import com.study.Banana;

//임포트할 클래스가 많을 때는 이렇게 하나씩 임포트하는 것 또한 불편. 그래서 여러 클래스를 한꺼번에 임포트해야할 때는 이렇게~
//컴파일 과정을 거치면서 실제로 사용되는 것만 임포트 된다.
import com.study.*;

public class Ex04_ImportUse {

	public static void main(String[] args) {
		Banana banana = new Banana();
		banana.showname();

	}

}

//*JDK 설치 폴더 아래 lib폴더에 있는 src.zip 파일의 압축을 해제해보면 개발자가 사용할 수 있는 자바 API의 소스를 확인할 수 있다.
// java.lang : 기본적인 클래스
// java.io   : 입출력 관련 클래스
// java.net  : 네트워크 관련 클래스
// java.util : 유틸리티 관련 클래스
// java.math : 수치연산 관련 클래스
// java.text : 텍스트, 숫자, 날짜 등의 국제화 관련 클래스
// java.time : 자바8이 지원하는 날짜 및 시간을 처리하는 클래스