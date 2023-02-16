package projectA04;

import java.util.Arrays;

public class projectA0407 {

	public static void main(String[] args) {
		// (2,100) 배열을 만드시오
		// 1번째에는 1~100까지 등록하고
		// 2번째에는 100~200까지 등록하시오
		int [][] intArray = new int[2][100];
		
		for(int i=1; i<=100; i++) {
			intArray[0][i-1] = i;
		}
		for(int i=101; i<=200; i++) {
			intArray[1][i-101] = i;
		}
		
//		내풀이
//		for(int j=0, k=1; j<intArray[0].length; j++, k++) {
//			intArray[0][j] = k;
//		}
//		for(int j=0, k=101; j<intArray[1].length; j++, k++) {
//			intArray[1][j] = k;
//		}
//		
		System.out.println(Arrays.deepToString(intArray));

		// 첫번째 행의 합
		int sum1 = 0;
		for(int i=0; i<intArray[0].length; i++) {
			sum1 += intArray[0][i];
		}
		System.out.println("첫번째 행의 합: "+sum1);
		
		// 두번째 행의 합
		int sum2 = 0;
		for(int i=0; i<intArray[1].length; i++) {
			sum2 += intArray[1][i];
		}
		System.out.println("두번째 행의 합: "+sum2);
		
	}

}
