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
		System.out.println("欢迎光临！本售货机只贩卖一种商品，价格为:"+price+"元");
		System.out.println("您当前余额为："+balance+"元");
		if(balance<price) {
			System.out.println("余额不足！请充值至少8元：");
			balance = scan.nextInt();
			if(balance>price) {
			System.out.println("您当前余额为："+balance+"元");
			}else {
				System.out.println("充值失败！");
			}
			canTimes = balance/price;
			System.out.println("您还能购买"+canTimes+"个商品");
		}
		
	}
	void buyFood() {
		if(balance>price) {
			System.out.println("请问您需要购买几个商品：");
			buyTimes = scan.nextInt();
		    balance = balance - price * buyTimes;
		    total = price * buyTimes;
			if(buyTimes<=canTimes) {
				
				System.out.println("您当前余额为："+balance+"元");
				System.out.println("您已购买"+buyTimes+"个商品,");
				System.out.println("您本次共消费"+total+"元,您购买的商品已交付，谢谢惠顾！");
			}else {
				System.out.println("购买失败！");
			}
			
		}else {
			System.out.println("购买失败！");
		}
	}
	public static void main(String[] args) {
		vm.show();
		vm.buyFood();
		scan.close();
	}

}

