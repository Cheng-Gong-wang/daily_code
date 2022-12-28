public class Test01 {
    public static void main(String[] args) {

        Animal b1 = new Bird();
        Animal c1 = new Cat();

        if (b1 instanceof Bird){
            Bird b2 = (Bird) b1;
            b2.move();
        }
        if (c1 instanceof Cat){
            Cat c2 = (Cat) c1;
            c2.move();
        }


    }
}
class Animal {

}
class Cat extends Animal{
    public void move(){
        System.out.println("Cat走猫步！");
    }
}
class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿在飞翔！");
    }
}