public class Test02 {
    public static void main(String[] args) {
        Master m1 = new Master("张三");
        m1.feed(new Cat());
    }
}
class Master{
    private String name;
    public Master(){

    }
    public Master(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void feed(Pet p){
        System.out.println(getName() + "在喂东西~" );
    }
}
class Pet{

}
class Dog extends Pet{
    public void eat(){
        System.out.println("狗在吃东西~");
    }
}
class Cat extends Pet{
    public void eat(){
        System.out.println("猫在吃东西~");
    }
}
class YingWu extends Pet{
    public void eat(){
        System.out.println("鹦鹉在吃东西~");
    }
}