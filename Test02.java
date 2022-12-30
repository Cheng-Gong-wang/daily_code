import java.sql.SQLOutput;

//定义一个人类
//属性包括：姓名、年龄、性别
//属性私有化，对外提供公开的set和get方法
//提供无参数构造和有参数构造
//提供一个生病方法：ill()，在该方法中打印信息，例如：张三，男，29岁生病了
//
//定义一个病毒类
//属性包括：病毒名称name、病毒体积size、病毒类型type
//属性私有化，对外提供公开的set和get方法
//提供无参数构造和有参数构造
//提供一个攻击attack()方法，该方法的参数是“人”，例如：attack(Person p)
//在attack()方法中调用人对象的生病方法。
//
//编写测试程序，创建病毒对象，创建人对象，模拟病毒攻击人。
public class Test02 {
    public static void main(String[] args) {
       /* Person p1 = new Person();
        p1.ill();*/
        Person p2 = new Person("lisi",20,true);
        Virus v1 = new Virus();
        v1.attack(p2);
    }
}
class Person {
    private String name;
    private int age;
    private Boolean gender;

    public void ill(){
        System.out.println(name +" "+ gender +" "+age+" 生病了");
    }

    public Person() {
        this("张三",18,true);
    }

    public Person(String name, int age, Boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
class Virus {
    private String name;
    private double size;
    private String type;

    public void attack(Person p1){
        System.out.println(this.name +"攻击了" + p1.getName()+ " 所以他生病了~");

    }

    public Virus() {
        this("新型冠状病毒" , 0.001 , "乙管乙类");
    }

    public Virus(String name, double size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
