/*
2���붨��һ����ͨ����(Vehicle)����
���������ԣ�
	�ٶ�(speed)
	���(size)�ȵ� 
	�����ƶ�(move())
	�����ٶ�(setSpeed(int speed))
	����speedUp(),
	����speedDown()�ȵ�. 

����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶���
��ͨ������������ʼ��speed,size��ֵ���Ҵ�ӡ������
������ü��ټ��ٵķ������ٶȽ��иı䡣
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
		System.out.println("�ý�ͨ���ߵ��ƶ��ٶ�Ϊ"+this.speed);
	}
	public void speedUp(int speed){
		
	}




}