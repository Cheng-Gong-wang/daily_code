//该程序输出斐波那契数列
//1 1 2 3 5 8 13 21 34 55 89 ...

public class Test01 {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 1;
        int temp;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i1);
            System.out.println(i2);
            i1 = i1 + i2;
            temp = i1 + i2;
            i2 = temp;
        }
    }
}
