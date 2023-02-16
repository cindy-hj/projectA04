package projectA04;

public class projectA0402 {

	public static void main(String[] args) {
		double score[][] = {
				{4.1,3.2},	// 1학년
				{3.5,3.6},	// 2학년
				{3.7,4.0},	// 3학년
				{4.1,4.2}	// 4학년
		};

		// 1학년의 평균
		int m1 = score[0].length;
		double summ1 = score[0][0]+score[0][1];
		double avgm1 = summ1/m1;
		System.out.println("1학년의 평균: "+avgm1);
		
		// 2학년의 평균
		int m2 = score[1].length;
		double summ2 = score[1][0]+score[1][1];
		double avgm2 = summ2/m2;
		System.out.println("2학년의 평균: "+avgm2);
		
		// 3학년의 평균
		int m3 = score[2].length;
		double summ3 = score[2][0]+score[2][1];
		double avgm3 = summ3/m3;
		System.out.println("3학년의 평균: "+avgm3);
		
		// 4학년의 평균
		int m4 = score[3].length;
		double summ4 = score[3][0]+score[3][1];
		double avgm4 = summ4/m4;
		System.out.println("4학년의 평균: "+avgm4);
		
		//전체 평균
		System.out.println("전체 평균: "+(summ1+summ2+summ3+summ4)/(m1+m2+m3+m4));
		
	}

}
