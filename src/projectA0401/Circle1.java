package projectA0401;

public class Circle1 {
	int radius;
	String name;
	
	public Circle1() { // 매개 변수 없는 생성자
		radius = 1; name = ""; // radius의 초기값은 1
	}
	
	public Circle1(int r, String n) { // 매개변수를 가진 생성자
		radius = r; name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle1 pizza = new Circle1(10, "자바피자"); // Circle객체 생성, 반지름 10
		double area = pizza.getArea();
		System.out.println(pizza.name +"의 면적은 " +area);
		
//		Circle1 donut = new Circle1(); // Circle객체 생성, 반지름1
//		donut.name = "도넛 피자";
//		area = donut.getArea(); // area 값 재할당
//		System.out.println(donut.name + "의 면적은 "+area);
		
		// projectA04의 객체를 가져온것, 현재 파일 내의 이름과 겹치면 안됨
		projectA04.Circle1 donut = new projectA04.Circle1();
		// projectA04에서 radius와 name을 public 처리 해줘야 접근 가능
		donut.radius = 5;
		donut.name = "도넛";
		double donutarea = donut.getArea();
		
	}

}
