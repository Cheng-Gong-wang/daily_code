/*
2、请定义一个交通工具(Vehicle)的类
其中有属性：
	速度(speed)
	体积(size)等等 
	方法移动(move())
	设置速度(setSpeed(int speed))
	加速speedUp(),
	减速speedDown()等等. 

最后在测试类Vehicle中的main()中实例化一个交通工具对象
并通过方法给它初始化speed,size的值并且打印出来。
另外调用加速减速的方法对速度进行改变。
*/

class Vehicle{
	private double speed;
	private double size;
	
	public Vehicle(){}
	public Vehicle(double speed,double size){
		this.speed = speed;
		this.size = size;
	}
	
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
		System.out.println("该交通工具的移动速度为"+this.speed);
	}
	public void speedUp(int speed){
		
	}




}