public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("张三",18,"北京市","122112","1223234442323");
        s2.getPostAddress();
    }
}
class Student{
    private String name;
    private int age;
    private String address;
    private String zipcode;
    private String mobile;
    public Student(){

    }
    public Student(String name,int age, String address, String zipcode,String mobile){
        this.name = name;
        this.address = address;
        this.age = age;
        this.mobile = mobile;
        this.zipcode = zipcode;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return  this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getZipcode(){
        return this.zipcode;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }
    public String getMobile(){
        return  this.mobile;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
    public void getPostAddress(){
        System.out.println(this.name + " 的地址是 " + this.address+
        "\n邮编是 " + this.zipcode);
    }









}
