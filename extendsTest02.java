public class extendsTest02 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(60,5);
        v2.speedUp(10);
        v2.detail();
        v2.speedDown(25);
        v2.detail();
        v1.detail();

    }
}
class Vehicle {
    private double speed;
    private double size;
    public Vehicle(){
        this(50,5);
    }
    public Vehicle(double speed,double size){
        this.speed = speed;
        this.size = size;
    }
    //添加setter and getter 方法
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSize(double size){
        this.size = size;
    }
    public double getSize(){
        return size;
    }
    public void move(){
        System.out.print("正在移动~" );
    }
    public void speedUp(double speed){
        this.setSpeed(this.speed + speed);
    }
    public void speedDown(double speed){
        this.setSpeed(this.speed - speed);
    }
    public void detail(){
        System.out.println("这辆汽车的速度为" + speed + "尺寸为 " + size + "米");
    }

}
