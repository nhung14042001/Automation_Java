package Java_OOP.PhamViTruyCap.Private_01;

public class Employee {
    private String name = "NhungNTT";
    private void getInfo(){
    System.out.println(name);
}
    public static void main(String[] args) {
    Employee employee = new Employee();
    employee.getInfo();
    }
}
