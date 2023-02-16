package projectA0402;

public class StudentExample {

	public static void main(String[] args) {
		// 같은 package 내에 존재하는 class를 사용 -> instance
		Student s1 = new Student();
		// class는 하나지만 2번 호출 가능, 같은 이름이면 안됨
		Student s2 = new Student();
		
		Car c1 = new Car();
		System.out.println(c1.color);
		
	}

}
