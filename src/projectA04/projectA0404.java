package projectA04;

public class projectA0404 {

	public static void main(String[] args) {
		int[][] grade = new int[3][3];
		String[] name = {"홍진호","임요환","이영호"};
		grade[0][0] = 70; // 국어
		grade[0][1] = 88; // 영어
		grade[0][2] = 99; // 수학
		
		grade[1][0] = 80; // 국어
		grade[1][1] = 60; // 영어
		grade[1][2] = 50; // 수학
		
		grade[2][0] = 100; // 국어
		grade[2][1] = 45; // 영어
		grade[2][2] = 90; // 수학
		
		// 국어의 평균을 구하기
		int korsum = 0;
		for(int i=0; i<grade.length; i++) {
			korsum = korsum+grade[i][0];
		}
		double koravg = korsum/grade.length;
		System.out.println("국어 평균: "+koravg);
		
		// 영어의 평균
		int engsum = 0;
		for(int i=0; i<grade.length; i++) {
			engsum = engsum+grade[i][1];
		}
		double engavg = engsum/grade.length;
		System.out.println("영어 평균: "+engavg);
		
		// 전체 평균
		for(int i=0; i<grade.length; i++) {
			int sum = 0;
			int avg = 0;
			for(int j=0; j<grade.length; j++) {
				sum = sum + grade[i][j];
			}
			avg = sum/grade[i].length;
			System.out.println(name[i]+"="+avg);
		}
	}

}
