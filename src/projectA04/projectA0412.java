package projectA04;

class Calc {
	public int abs(int a) {return a>0?a:-a;}
	public static int max(int a, int b) {return (a>b)?a:b;}
	public static int min(int a, int b) {return (a>b)?b:a;}
}

public class projectA0412 {

	public static void main(String[] args) {
		// instance화
		Calc calc = new Calc();
		System.out.println(calc.abs(-5));
		
		// static 변수를 작성해서 instance화 하지 않아도 class 이름으로 접근 가능
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}

}
