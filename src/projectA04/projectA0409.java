package projectA04;

public class projectA0409 {
	// method는 class 내부이면서 main과 동등한 레벨이므로 main 바깥에서 생성
	public int sum(int a, int b) {
		int c;
		c = a+b;
		return c;
	}
	
	int[] makeArray() {
		int[] temp = new int[4];
		for(int i=0; i<temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}
	
	int[] cal(int a, int b) {
		int[] cal = new int[4];
		
		cal[0] = a+b;
		cal[1] = a-b;
		cal[2] = a*b;
		cal[3] = a/b;
		
		return cal;
	}
	
	// void는 return을 하지 않으므로 호출할수 없다. main은 실행 할때 사용하는 method
	public static void main(String[] args) {
		projectA0409 proj = new projectA0409(); // 클래스 생성
		int[] cal = proj.cal(10, 10); // 배열 생성
		System.out.println("+:"+cal[0]);
		System.out.println("-:"+cal[1]);
		System.out.println("*:"+cal[2]);
		System.out.println("/:"+cal[3]);
		
	}

}
