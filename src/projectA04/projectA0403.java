package projectA04;

public class projectA0403 {

	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		// 비정형배열
		
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10+j;
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
