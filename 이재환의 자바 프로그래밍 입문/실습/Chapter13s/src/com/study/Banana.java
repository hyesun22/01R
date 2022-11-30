//많은 클래스를 다루는 대규모 프로그램을 작성하는 경우, 이름이 같은 클래스들을 사용해야하는 상황이 발생할 수 있음
//한 폴더에서 클래스 파일이 많아지면 클래스명이 충돌할 수 있는데, 충돌을 방지하는 효과적인 방법은 폴더를 나누어 관리하는것.
//package: 관련이 있는 클래스를 묶어 폴더로 구분하여 관리하는 기법
//(패키지명은 클래스명과 구분하기 위해 모두 소문자로 만든다. 대문자로 시작하는 한 단어가 클래스명이 된다.)
package com.study;

public class Banana {
	public void showname()
	{
		System.out.println("My name is banana");
	}
}
