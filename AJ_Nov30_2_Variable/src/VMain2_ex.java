
public class VMain2_ex {
	public static void main(String[] args) {
		
		/* <���� 1>
		 * ����Ż����
		 * ������ 1000��
		 * �뷮�� 80ml
		 * ����� 99.9%
		 * ������ ��
		 * ȸ�簡 ���̼�
		 * ��Ȱ�� �ؾ��� (%b)
		 */
		
		String name = "����Ż����";
		int price = 1000;
		int volume = 80;
		double antibacterial = 99.9;
		char color = '��';
		String company = "���̼�";
		boolean recycle = true;
		
		System.out.printf("��ǰ �̸� : %s\n", name);
		System.out.printf("���� : %d��\n", price);
		System.out.printf("�뷮 : %dml\n", volume);
		System.out.printf("��� : %.1f%%\n", antibacterial);
		System.out.printf("���� ���� : %s\n", color);
		System.out.printf("ȸ�� : %s\n", company);
		System.out.printf("��Ȱ�� ���� : %b\n", recycle);
		
		System.out.println("-----------------------");
		
		/* <���� 2>
		 * �̸� ���ó�¥(���� �� ��) ��°�
		 * �÷� java������ ����
		 */
		
		String myName = "����";
		int year = 2021;
		int month = 12;
		int day = 20;
		String home = "����";
		double eye = 0.9;
		boolean java = false;
		
		System.out.printf("�̸� : %s\n", myName);
		System.out.printf("���� ��¥ : %d.%d.%d\n", year, month, day);
		System.out.printf("�� : %s\n", home);
		System.out.printf("�÷� : %.1f\n", eye);
		System.out.printf("java�� �������� : %b\n", java);
		
	}
	
}
