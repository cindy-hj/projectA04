package projectA04;

import java.util.Scanner;

public class projectA0410 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("나눔수를 입력하시오");
		dividend = scanner.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = scanner.nextInt();
		
		try {
			System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");	
		} catch (Exception e) {
			// 어떤 예외가 와도 처리
			System.out.println("예외가 발생");
		} 
//		catch (ArithmeticException e) {
//			// 특정 예외 처리(수학적 예외)
//		}
//		finally {
//		예외와 상관없이 항상 실행할 내용
// 		try-catch를 사용하지 않으면 예외 발생시 프로그램 멈춤 
//      catch를 사용하면 예외 발생해도 프로그램 멈추지 않음
//		}
		scanner.close();

	}

}
