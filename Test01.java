/*
* 在画图软件中，可以画出不同大小或颜色的圆形、矩形等几何图形。几何图形之间有许多共同的特征，
* 如它们可以是用某种颜色画出来的，可以是填充的或者不填充的。此外还有些不同的特征，比如，
* 圆形都有半径，可以根据半径计算圆形的面积和周长，矩形都有宽和高，可以根据宽高来计算矩形的
* 面积和周长。
1、编写Java程序。
(1)使用继承机制，分别设计实现抽象类 图形类，子类类圆形类、正方形类、长方形类，要求：
①抽象类图形类中有属性包括画笔颜色(String类型)、图形是否填充(boolean类型：true表示填充，false表示不填充)，
有方法获取图形面积、获取图形周长等；
②使用构造方法为其属性赋初值；
③在每个子类中都重写toString()方法，返回所有属性的信息；
④根据文字描述合理设计子类的其他属性和方法。

(2)设计实现画板类，要求：
①画一个红色、无填充、长和宽分别为10.0与5.0的长方形；
②画一个绿色、有填充、半径为3.0的圆形；
③画一个黄色、无填充、边长为4.0的正方形；
④分别求三个对象的面积和周长，并将每个对象的所有属性信息打印到控制台。
*
* */
public class Test01 {
    public static void main(String[] args) {
        graph c1 = new circle("绿色",true,3.0);
        if (c1 instanceof circle){
            circle c2 = (circle) c1;
            System.out.println(c2.toString());

        }
        graph s1 = new square("黄色",false,4.0);
        if (s1 instanceof square){
            square s2 = (square) s1;
            System.out.println(s2.toString());
        }
        graph r1 = new rect("红色",false,10.0,5.0);
        if (r1 instanceof rect){
            rect r2 = (rect) r1;
            System.out.println(r2.toString());
        }

    }
}
abstract class graph {
    String color;
    Boolean isFull;
    public static final double PI = 3.1415926;
    public abstract void lineWidth(double width);
    public graph() {
        this("黑色",false);
    }
    public graph(String color, Boolean isFull) {
        this.color = color;
        this.isFull = isFull;
    }
}
class circle extends graph {
    double radius;
    public void lineWidth(double width){
        System.out.println("圆形的线宽是"+ width);
    }
    public circle(){

    }
    public circle(double radius) {
        this.radius = radius;
    }
    public circle(String color, Boolean isFull, double radius) {
        super(color, isFull);
        this.radius = radius;
    }
    public double area(double radius){
        return PI * radius * radius;
    }
    public double perimeter(double radius){
        return PI * 2 * radius;
    }
    public String toString() {
        return "该圆的颜色为" + color + "填充方式为" + isFull + "半径为" + radius + "面积为" + area(radius) + "周长为"+ perimeter(radius);
    }
}
class square extends graph {
    double sideWidth;
    public void lineWidth(double width){
        System.out.println("正方形的线宽是"+ width);
    }
    public square(){

    }
    public square(double sideWidth) {
        this.sideWidth = sideWidth;
    }

    public square(String color, Boolean isFull, double sideWidth) {
        super(color, isFull);
        this.sideWidth = sideWidth;
    }
    public double area(double sideWidth){
        return sideWidth * sideWidth;
    }
    public double perimeter(double sideWidth){
        return 4 * sideWidth;
    }
    public String toString() {
        return "该正方形的颜色为" + color + "填充方式为" + isFull + "边长为" + sideWidth + "面积为" + area(sideWidth) + "周长为"+ perimeter(sideWidth);
    }
}
class rect extends graph {
    double length;
    double width;
    public void lineWidth(double width){
        System.out.println("矩形的线宽是"+ width);
    }
    public rect(){

    }
    public rect(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public rect(String color, Boolean isFull, double length, double width) {
        super(color, isFull);
        this.length = length;
        this.width = width;
    }
    public double area(double length,double width){
        return length * width;
    }
    public double perimeter(double length,double width){
        return 2 * (length + width);
    }
    public String toString() {
        return "该矩形的颜色为" + color + "填充方式为" + isFull + "长为" + length + "宽为" +width+ "面积为" + area(length,width) + "周长为"+ perimeter(length,width);
    }
}