class ForTest01{
	public static void main(String[] args){
	int sum = 0;
	for (int i = 1;i <= 100;i += 2){
	sum += i;
	if (i ==99){
	System.out.print(i + "=");
	}else{
	System.out.print(i + "+");
	}
	}
	System.out.print(sum);
	}
}