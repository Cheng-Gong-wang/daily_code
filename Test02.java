//打印空心菱形
import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("请输入空心菱形的行数： ");
        int rows = s1.nextInt();
        for (int i = 1; i <= rows; i++) {
            System.out.print("*" + " ");
        }


    }


}
