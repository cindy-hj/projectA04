package projectA04;

public class Circle {
	// instance 변수-> instance화 되어야지만 접근가능
	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드
    
    // static 변수로 정의 하면 instance화 하지 않아도 바로 사용가능
    // static으로 선언된건 class 변수라고 한다
    // static int radius;
	
	// instance method
	public Circle() {} // 원의 생성자
	
	public double getArea() { // 원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		// instance화
		pizza = new Circle(); // Circle 객체 생성
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; // 피자의 이름을 설정
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle(); // Circle 객체 생성
		donut.radius = 2; // 도넛의 반지름을 2로 설정
		donut.name = "자바도넛"; // 도넛의 이름을 설정
		area = donut.getArea(); // 도넛의 면적 알아내기
		System.out.println(donut.name+"의 면적은 "+area);
		
	}

}
