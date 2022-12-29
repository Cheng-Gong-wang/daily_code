public class CharTest01{
	public static void main(String[] args){
		char array02[] = new char[26];
	
		for(int i = 0; i < array02.length; i++){
			array02[i] = (char)('A' + i);
		}
		for(int j = 0; j < array02.length; j++){
			System.out.print (array02[j] + " ");
		}

	}
}