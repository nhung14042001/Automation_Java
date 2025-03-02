package Java_OOP.HamXayDung;

public class Hamxaydung_Khongthamso {
    public String name; //không khai biến giá trị
    public String phone; // khng khai biến giá trị
    public Hamxaydung_Khongthamso(){  //hàm xây dựng - có tên hàm giống tên class
        name = "NhungNTT";
        phone = "0123445";
    }

    public static void main(String[] args) {
        Hamxaydung_Khongthamso hamxaydung01 = new Hamxaydung_Khongthamso();
        System.out.println(hamxaydung01.name);
        System.out.println(hamxaydung01.phone);
    }
}
