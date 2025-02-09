package DieuKien;
public class If {
    public static void main(String[] args) {
        int age =20;
        String address = "Long An";
        //- So sánh bằng trong chuỗi dùng hàm equals ()
        //- So sánh chứa trong chuỗi dùng hàm contains (
        if (age > 18 && address.equals("Long An")){
            System.out.println("Tuổi lớn hơn 18");
        }
        if (address.contains("Long")){
            System.out.println("Dia chi chinh xac");
        }
    }
}
