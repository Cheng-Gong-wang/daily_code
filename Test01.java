public class Test01 {
    public static void main(String[] args) {
        Musician m1 = new Musician();
        Musician m2 = new Musician("张三");

        Instrument i1 = new erHu();
        Instrument i2 = new piano();
        Instrument i3 = new violin();

        if (i1 instanceof erHu){
            erHu i4 = (erHu) i1;
            i4.playMusic();
        }else if (i1 instanceof piano){
            piano i5 = (piano) i1;
            i5.playMusic();
        }else if (i1 instanceof violin){
            violin i6 = (violin) i1;
            i6.playMusic();
        }
        m2.play(i1);


    }
}
class Musician {
    private String name;
    public Musician(){}
    public Musician(String name){
        this.name = name;
    }
    //setter and getter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void play(Instrument i){
        System.out.println(this.name + "乐手正在用"+i+"奏乐");
    }
}
class Instrument {

    public void makeSound(){
        System.out.println("乐器正在演奏");
    }
}
class erHu extends Instrument{
    public void playMusic(){
        System.out.println("二胡正在演奏二泉音乐~");
    }
    public String toString(){
        return "二胡正在演奏二泉音乐~";
    }
}
class piano extends Instrument{
    public void playMusic(){
        System.out.println("正在演奏肖邦的钢琴曲~");
    }
    public String toString(){
        return "正在演奏肖邦的钢琴曲~";
    }
}
class violin extends Instrument{
    public void playMusic(){
        System.out.println("正在演奏维瓦尔第的四季~");
    }
    public String toString(){
        return "正在演奏维瓦尔第的四季~";
    }
}
