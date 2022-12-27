class ForTest04{
	public static void main(String[] args){
	for (int i = 2;i < 10000;i++){
		if (i % 2 != 0 || i == 2){
			int x = 0;
			for (int k = 3;k < ((i-1)/2);k +=2){
				if (i % k == 0){
					x += 1;
				}
			}
			if (x == 0){
				System.out.print(i + " " + " ");
			}


		}
	}
	
	
	
	}
}