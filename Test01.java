//定义一个学生类
//属性包括：学生编号、学生姓名、学生年龄
//属性私有化，对外提供公开的set和get方法
//提供无参构造和有参数构造方法
//提供一个display()方法，通过该方法打印学生信息。
//编写测试程序创建对象，调用display()方法。
public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student(1510060218,"张三",18);
        s1.display();
    }
}
class Student {
    private int id;
    private String name;
    private int age;

    public void display(){
        System.out.println(" 该学生的学号为 " + id + " 姓名为 " + name + " 年龄为 " + age);
    }

    public Student() {

    }
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
