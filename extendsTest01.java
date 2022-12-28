import java.util.Scanner;
public class extendsTest01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("请输入一个正整数： " );
        int i = s1.nextInt();
        guessNum(i);
    }
    public static void guessNum(int i){
        Scanner s1 = new Scanner(System.in);
        A a = new A();
        if (i != a.getV()){
            if (i > a.getV()){
                System.out.println("猜大了~");
            }else if(i < a.getV()){
                System.out.println("猜小了~");
            }
            System.out.print("请重新猜测： ");
            guessNum(s1.nextInt());
        } else{
            System.out.print("恭喜您猜对了！");
        }
    }
}
class A {
    private int v = 42;
    public A (){}
    public void setV(int v){
        this.v = v;
    }
    public int getV(){
        return v;
    }

}