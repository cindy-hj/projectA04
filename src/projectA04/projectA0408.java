package projectA04;

import java.util.Arrays;

public class projectA0408 {

	public static void main(String[] args) {
		// 가변배열을 만드는데 첫번째는 1~200까지 저장
		// 두번째는 201~300까지 저장
		// 세번째는 301~500까지 저장 하도록 배열을 만드시오
		int [][] intArray = new int[3][];
		intArray[0] = new int[200];
		intArray[1] = new int[100];
		intArray[2] = new int[200];
		
		for(int i=0,j=1; i<intArray[0].length; i++,j++) {
			intArray[0][i] = j;
		}
		for(int i=0,j=201; i<intArray[1].length; i++,j++) {
			intArray[1][i] = j;
		}
		for(int i=0,j=301; i<intArray[2].length; i++,j++) {
			intArray[2][i] = j;
		}
		System.out.println(Arrays.deepToString(intArray));
		
		// 각 배열에서 홀수만 출력하시오
		for(int j=0; j<intArray.length; j++) {
			for(int i=0; i<intArray[j].length; i++) {
				if(intArray[j][i]%2 != 0) {
					System.out.print(intArray[j][i]+" ");
				}
			}
			System.out.println();
		}
	}

}
