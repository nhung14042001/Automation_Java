package Java_OOP.TinhKeThua;
public class Student extends Person{
public Student (String name, int age, float height){
    super(name,age,height); //Mục đích super đảm bảo cấu trúc hàm xây dựng
}

    public void showInfoStudent(){
        System.out.println(name);
        System.out.println(age);
        getInfo();//Từ class cha Person
    }

    public static void main(String[] args) {
    Student student = new Student("NhungNTT", 12, 55);
    student.getInfo();
    }

}