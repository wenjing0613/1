import java.util.Scanner;

public class VendingMachine {
	static VendingMachine vm = new VendingMachine();
	static Scanner scan = new Scanner(System.in);
	int price = 8;
	int balance = 0;
	int total = 0;
	int canTimes;
	int buyTimes;
	void show() {
		System.out.println("��ӭ���٣����ۻ���ֻ����һ����Ʒ���۸�Ϊ:"+price+"Ԫ");
		System.out.println("����ǰ���Ϊ��"+balance+"Ԫ");
		if(balance<price) {
			System.out.println("���㣡���ֵ����8Ԫ��");
			balance = scan.nextInt();
			if(balance>price) {
			System.out.println("����ǰ���Ϊ��"+balance+"Ԫ");
			}else {
				System.out.println("��ֵʧ�ܣ�");
			}
			canTimes = balance/price;
			System.out.println("�����ܹ���"+canTimes+"����Ʒ");
		}
		
	}
	void buyFood() {
		if(balance>price) {
			System.out.println("��������Ҫ���򼸸���Ʒ��");
			buyTimes = scan.nextInt();
		    balance = balance - price * buyTimes;
		    total = price * buyTimes;
			if(buyTimes<=canTimes) {
				
				System.out.println("����ǰ���Ϊ��"+balance+"Ԫ");
				System.out.println("���ѹ���"+buyTimes+"����Ʒ,");
				System.out.println("�����ι�����"+total+"Ԫ,���������Ʒ�ѽ�����лл�ݹˣ�");
			}else {
				System.out.println("����ʧ�ܣ�");
			}
			
		}else {
			System.out.println("����ʧ�ܣ�");
		}
	}
	public static void main(String[] args) {
		vm.show();
		vm.buyFood();
		scan.close();
	}

}

