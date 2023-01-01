public class ControlHomework01{
	public static void main(String[] args){
		double money = 100000;
		double balance = money;
		int times = 0;

		while(balance >= 0){
			if(balance > 50000){
				balance -= (balance * 0.05);
				times += 1;
			}else{
				if((balance - 1000) < 0){
					break;
				}
				balance -= 1000;
				times += 1;
			}
		}
		System.out.println(money + " 元可以经过 "+ times+"路口 还剩余额为"+balance+"元");
	}
}