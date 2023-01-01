public class ControlHomework04{
	public static void main(String[] args){
		int bits = 0;
		int ten = 0;
		int hundred = 0;
		for(int i = 100; i <= 999; i++){
			bits = i % 10;
			hundred = i / 100;
			ten = (i % 100) / 10;
			if(i == (bits*bits*bits + hundred*hundred*hundred + ten*ten*ten) ){
				System.out.println(i);
			}
		}
	}
}