
public class VMain3_ex {
	public static void main(String[] args) {
		
		/* <예제>
		 * 점심식사 메뉴(이름), 가격, 칼로리, 평점, 나중에 또 먹을지
		 */
		
		String lunchMenu = "김밥";
		int price = 5000;
		int kcal = 500;
		double grade = 4.3;
		boolean againMenu = true;
		
		System.out.printf("점심 메뉴 : %s\n", lunchMenu);
		System.out.printf("가격 : %d원\n", price);
		System.out.printf("칼로리 : %dkcal\n", kcal);
		System.out.printf("평점 : %.1f\n", grade);
		System.out.printf("재방문의사 : %b\n", againMenu);
		
		/* <cmd 출력방법>
		 * 1) 쫙 실행한뒤,
		 * 2) export로 이름 위치 지정하고,
		 * 3) 메모장가서 모든문서로 선택한 뒤, 이름.bat 로 하고 같은 위치에 저장
		 */
		
	}
	
}
