package projectA04;

import java.util.Arrays;

public class projectA0406 {

	public static void main(String[] args) {
		int[] array1D = {1,2,3,4,5,6,7,8,9};
		int[][] array2D = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		
		for(int i=0; i<array1D.length; i++) {
			System.out.print(array1D[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(array1D));
		System.out.println(Arrays.toString(array2D));
		System.out.println(Arrays.deepToString(array2D)); // 다차원배열 값 확인

	}

}
