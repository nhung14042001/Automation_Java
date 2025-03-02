 package Java_OOP.Package_01;
public class Class {
String mess ="Login successfully";
public void testmess(){
    System.out.println("Test Login mess");
}
    public static void main(String[] args) {
     Class Login = new Class();
     Login.testmess();
        System.out.println(Login.mess);
        new Class().testmess(); // Gọi kiểu vô danh (khum khuyến khích)
}

    }
