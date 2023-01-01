public class ControlHomework06{
	public static void main(String[] args){
		char a = 97;
		char Z = 90;

		for(int i = 0; i <= 25; i++){
			System.out.print (a++ + " ");
		}
		System.out.print("\n");
		for(int j = 25; j >= 0; j--){
			System.out.print(Z-- + " ");
		}
		System.out.println("\n");

		for(char c1 = 'a'; c1 <= 'z'; c1++){
			System.out.print(c1 + " ");
		}
		System.out.println(" ");

		for(char c1 = 'Z'; c1 >= 'A'; c1--){
			System.out.print(c1 + " ");
		}

		
	}
}