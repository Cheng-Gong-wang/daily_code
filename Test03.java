//某公司的雇员分为以下若干类：
//	Employee：这是所有员工总的父类，
//		属性：
//			员工的姓名,员工的生日月份。
//		方法：getSalary(intmonth)
//			根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
//
//	SalariedEmployee：
//		Employee 的子类，拿固定工资的员工。
//		属性：月薪
//
//	HourlyEmployee：
//		Employee 的子类， 按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。
//		属性：每小时的工资、每月工作的小时数
//
//	SalesEmployee：
//		Employee 的子类，销售人员，工资由月销售额和提成率决定。
//		属性：月销售额、提成率
//
//	BasePlusSalesEmployee：
//		SalesEmployee 的子类，有固定底薪的销售人员，工资 由底薪加上销售提成部分。
//		属性：底薪。
//
//	根据要求创建 SalariedEmployee 、 HourlyEmployees 、SaleEmployee 和 BasePlusSalesEmployee四个类的对象各一个，
//	并计算某个月这四个对象的工资。
//
//	注意：要求把每个类都做成完全封装，不允许非私有化属性。
public class Test03 {
    public static void main(String[] args) {
        Employee sde1 = new SalariedEmployee("张三","12",3000);
        if (sde1 instanceof SalariedEmployee){
            SalariedEmployee sde2 = (SalariedEmployee) sde1;
            sde2.getSalary("3");
        }
        Employee hou1 = new HourlyEmployee("李四","9",90,170);
        if (hou1 instanceof HourlyEmployee){
            HourlyEmployee hou2 = (HourlyEmployee) hou1;
            hou2.getSalary("3");
        }
        Employee sse1 = new SalesEmployee("王五","11",100000,0.1);
        if (sse1 instanceof SalesEmployee){
            SalesEmployee sse2 = (SalesEmployee) sse1;
            sse2.getSalary("3");
        }
        Employee bps1 = new BasePlusSalesEmployee("赵六","3",50000,0.2,2000);
        if (bps1 instanceof BasePlusSalesEmployee){
            BasePlusSalesEmployee bps2 = (BasePlusSalesEmployee) bps1;
            bps2.getSalary("3");
        }
    }
}
class Employee {
    private String name;
    private String birth;

    public void getSalary (String month){
        System.out.println("如果该月员工过生日，则公司会额外奖励100 元");
    }

    public Employee() {
    }

    public Employee(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
class SalariedEmployee extends Employee {
    private double salaryMonth;

    public void getSalary (String month){
        if (this.getBirth().equals(month)){
            this.salaryMonth += 100;
        }
        System.out.println("该月员工在" +month + "月的月薪为" + this.salaryMonth);
    }

    public SalariedEmployee(){

    }
    public SalariedEmployee(double salaryMonth) {
        this.salaryMonth = salaryMonth;
    }
    public SalariedEmployee(String name, String birth, double salaryMonth) {
        super(name, birth);
        this.salaryMonth = salaryMonth;
    }
    public double getSalary() {
        return salaryMonth;
    }
    public void setSalary(double salaryMonth) {
        this.salaryMonth = salaryMonth;
    }
}
class HourlyEmployee extends Employee {
    private double salaryHour;
    private double workHourMonth;
    private double sumSalary;

    public void getSalary (String month){
        if (this.workHourMonth <= 160){
            sumSalary = salaryHour * workHourMonth;
        } else if(workHourMonth > 160){
            sumSalary = salaryHour * 160 + salaryHour * 1.5 * (workHourMonth - 160);
        }
        if (this.getBirth().equals(month)){
            this.sumSalary += 100;
        }
        System.out.println("该月员工在" +month + "月的月薪为" + this.sumSalary);
    }
    public HourlyEmployee(){

    }
    public HourlyEmployee(double salaryHour, double workHourMonth, double sumSalary) {
        this.salaryHour = salaryHour;
        this.workHourMonth = workHourMonth;
        this.sumSalary = sumSalary;
    }

    public HourlyEmployee(String name, String birth, double salaryHour, double workHourMonth) {
        super(name, birth);
        this.salaryHour = salaryHour;
        this.workHourMonth = workHourMonth;
    }

    public HourlyEmployee(String name, String birth, double salaryHour, double workHourMonth, double sumSalary) {
        super(name, birth);
        this.salaryHour = salaryHour;
        this.workHourMonth = workHourMonth;
        this.sumSalary = sumSalary;
    }

    public double getSalaryHour() {
        return salaryHour;
    }

    public void setSalaryHour(double salaryHour) {
        this.salaryHour = salaryHour;
    }

    public double getWorkHourMonth() {
        return workHourMonth;
    }

    public void setWorkHourMonth(double workHourMonth) {
        this.workHourMonth = workHourMonth;
    }

    public double getSumSalary() {
        return sumSalary;
    }

    public void setSumSalary(double sumSalary) {
        this.sumSalary = sumSalary;
    }
}
class SalesEmployee extends Employee {
    private double saleMonth;
    private double royRate;
    private double sumSalary;

    public void getSalary (String month){
        sumSalary = saleMonth * royRate;
        if (this.getBirth().equals(month)){
            this.sumSalary += 100;
        }
        System.out.println("该月员工在" +month + "月的月薪为" + this.sumSalary);
    }
    public SalesEmployee(){

    }
    public SalesEmployee(double saleMonth, double royRate, double sumSalary) {
        this.saleMonth = saleMonth;
        this.royRate = royRate;
        this.sumSalary = sumSalary;
    }

    public SalesEmployee(String name, String birth, double saleMonth, double royRate) {
        super(name, birth);
        this.saleMonth = saleMonth;
        this.royRate = royRate;
    }

    public SalesEmployee(String name, String birth, double saleMonth, double royRate, double sumSalary) {
        super(name, birth);
        this.saleMonth = saleMonth;
        this.royRate = royRate;
        this.sumSalary = sumSalary;
    }

    public double getSaleMonth() {
        return saleMonth;
    }

    public void setSaleMonth(double saleMonth) {
        this.saleMonth = saleMonth;
    }

    public double getRoyRate() {
        return royRate;
    }

    public void setRoyRate(double royRate) {
        this.royRate = royRate;
    }

    public double getSumSalary() {
        return sumSalary;
    }

    public void setSumSalary(double sumSalary) {
        this.sumSalary = sumSalary;
    }
}
class BasePlusSalesEmployee extends SalesEmployee {
    private double baseSalary;

    public void getSalary (String month){
        this.setSumSalary(baseSalary + getRoyRate() * getSaleMonth());
        if (this.getBirth().equals(month)){
            this.setSumSalary(baseSalary + getRoyRate() * getSaleMonth() + 100);
            this.getSumSalary();
        }
        System.out.println("该月员工在" +month + "月的月薪为" + this.getSumSalary());
    }
    public BasePlusSalesEmployee(){

    }
    public BasePlusSalesEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public BasePlusSalesEmployee(double saleMonth, double royRate, double sumSalary, double baseSalary) {
        super(saleMonth, royRate, sumSalary);
        this.baseSalary = baseSalary;
    }
    public BasePlusSalesEmployee(String name, String birth, double saleMonth, double royRate, double baseSalary) {
        super(name, birth, saleMonth, royRate);
        this.baseSalary = baseSalary;
    }

    public BasePlusSalesEmployee(String name, String birth, double saleMonth, double royRate, double sumSalary, double baseSalary) {
        super(name, birth, saleMonth, royRate, sumSalary);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}