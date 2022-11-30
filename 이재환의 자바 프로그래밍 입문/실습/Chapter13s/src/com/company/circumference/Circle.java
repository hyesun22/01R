//기본적인 패키지명이 com.company이고 원의 넓이를 구한 부서의 이름을 length라 가정
package com.company.circumference;

public class Circle {
	double rad;
	final double PI;
	
	
	public Circle(double r) {
		rad = r;
		PI  = 3.14;
	}
	
	//원의 둘레 길이 반환
	public double getCircumference() {
		return (rad * 2) * PI;
	}
}
