public class Employee {
    // Attribute
    private String id;
    private String name;
    private double salary;

    // Create Methods
    public void setId(String id) {
        // keyword this คือการอ้างอิงคุณสมบัติของแต่ละตัว
        this.id = id;
    }
    public  void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    // สร้าง Methods ที่เอาไว้แสดง print
    public void displayEmployee(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
