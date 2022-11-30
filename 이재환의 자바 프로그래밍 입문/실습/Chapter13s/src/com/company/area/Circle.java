//기본적인 패키지명이 com.company이고 원의 넓이를 구한 부서의 이름을 area라 가정
package com.company.area;

public class Circle {
	double rad;
	final double PI;
	
	
	public Circle(double r) {
		rad = r;
		PI  = 3.14;
	}
	
	//원의 넓이 반환
	public double getArea() {
		return (rad * rad) * PI;
	}
	
}
