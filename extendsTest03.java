public class extendsTest03 {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        t1.display();

    }
}
class MyTime{
    private int hour;
    private int minute;
    private int second;

    public void display(){
        System.out.print(hour + " 时 " +minute + " 分 " + second + " 秒 " + " ");
    }
    public MyTime (){
        this(23,55,15);
    }
    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //setter and getter
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
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
    public void addHour(int hour){
        if (this.hour + hour >= 24) {
        }
    }







}
