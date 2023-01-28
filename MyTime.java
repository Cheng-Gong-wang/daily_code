class MyTime{
	private int hour;
	private int minute;
	private int second;
	
	//创建构造方法
	public MyTime(){

	}
	public MyTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	//创建各属性的getter和setter方法
	public void SetHour(int hour){
		this.hour = hour;
	}
	public int getHour(){
		return hour;
	}
	public void setMinute(int monute){
		this.minute = minute;
	}
	public int getMinute(){
		return minute;
	}
	public void setSecond(int second){
		this.second = second;
	}
	public int getSecond(){
		return second;
	}

	//显示目前时间的方法
	public void display(){
		System.out.println(this.hour + " 时 - " + this.minute +" 分 - "+ this.second +" 秒 ");
	}
	

	public int addHour(int hour){
		this.hour += hour;
		int n = this.hour / 24;
		this.hour -= (24 * n);
		return this.hour;
	}

	public int subHour(int hour){
		this.hour -= hour;
		if (this.hour < 0){
			 

		}
		return this.hour;
	}

	public int addMinute(int minute){
		this.minute += minute;
		if (this.minute >= 60){
			this.hour += 1;
			this.minute -= 60;
		}
		return this.minute;
	}
	public int subMinute(int minute){
		this.minute -= minute;
		if (this.minute <= 0){
			this.hour -= 1;
			this.minute += 60;
		}
		return this.minute;
	}
	public int addSecond(int second){
		second = second % 60;
		this.second += second;
		if (this.second >= 60){
			this.minute += 1;
			if (this.minute >= 60){
				this.hour += 1;
				if (this.hour >= 24){
					this.hour -= 24;
				}
				this.minute -= 60;
			}
			this.second -= 60;

		}
		return this.second;
	}
	public int subSecond(int second){
		this.second -= second;
		if (this.second <= 0){
			this.second += 60;
			this.minute -= 1;
		}
		return this.second;
	}


}