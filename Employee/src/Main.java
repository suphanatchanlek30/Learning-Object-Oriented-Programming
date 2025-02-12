public class Main {
    public static void main(String[] args) {
        // ให้สร้าง Object
        // ชื่อClass ชื่อObject = new ชื่อClass();
        Employee e1 = new Employee(); //Create Object

        /*
        กำหนดค่า set แบบโดยตรง
        e1.id = "1"; // Assign
        e1.name = "Suphanat Chanlek";
        e1.salary = 30000.0;

         */

        // เรียกใช้งานผ่าน Methods ที่เราสร้างไว้ใน Class
        e1.setId("1");
        e1.setName("Suphanat Chanlek1");
        e1.setSalary(30000);

        Employee e2 = new Employee();
        e2.setId("2");
        e2.setName("Suphanat Chanlek2");
        e2.setSalary(35000);

        // เรียกใช้ methods ที่เราสร้างไว้ใน Employee
        e1.displayEmployee();
        e2.displayEmployee();

        // แสดงแค่ชื่อออกมา ตาม Methods getName() ที่เราสร้างไว้
        System.out.println("ID = " + e1.getId());
        System.out.println("Name = " + e1.getName());
        System.out.println("Salary = " + e1.getSalary());
    }
}