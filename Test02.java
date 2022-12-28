public class Test02 {
    static Student stu = new Student();

    public static void main(String[] args){
        Test02.stu.exam();
    }
}
class Student {
    public void exam(){
        System.out.println("正在考试~");
    }
}
