
public class VMain2_ex {
	public static void main(String[] args) {
		
		/* <예제 1>
		 * 섬유탈취제
		 * 가격이 1000원
		 * 용량이 80ml
		 * 향균이 99.9%
		 * 색깔은 무
		 * 회사가 다이소
		 * 재활용 해야함 (%b)
		 */
		
		String name = "섬유탈취제";
		int price = 1000;
		int volume = 80;
		double antibacterial = 99.9;
		char color = '무';
		String company = "다이소";
		boolean recycle = true;
		
		System.out.printf("제품 이름 : %s\n", name);
		System.out.printf("가격 : %d원\n", price);
		System.out.printf("용량 : %dml\n", volume);
		System.out.printf("향균 : %.1f%%\n", antibacterial);
		System.out.printf("색깔 유무 : %s\n", color);
		System.out.printf("회사 : %s\n", company);
		System.out.printf("재활용 유무 : %b\n", recycle);
		
		System.out.println("-----------------------");
		
		/* <예제 2>
		 * 이름 오늘날짜(연도 월 일) 사는곳
		 * 시력 java경험의 유무
		 */
		
		String myName = "진아";
		int year = 2021;
		int month = 12;
		int day = 20;
		String home = "평택";
		double eye = 0.9;
		boolean java = false;
		
		System.out.printf("이름 : %s\n", myName);
		System.out.printf("오늘 날짜 : %d.%d.%d\n", year, month, day);
		System.out.printf("집 : %s\n", home);
		System.out.printf("시력 : %.1f\n", eye);
		System.out.printf("java의 경험유무 : %b\n", java);
		
	}
	
}
