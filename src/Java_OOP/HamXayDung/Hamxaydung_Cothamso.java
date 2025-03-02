package Java_OOP.HamXayDung;
public class Hamxaydung_Cothamso {
    public String name;
    public String phone;
    public String address;
    public Hamxaydung_Cothamso(String nameI, String phone, String address) {
        name = nameI; // chỉ dùng từ khóa this khi trùng tên,để phân biệt biến ở phía trên
        this.phone = phone;
        this.address = address;
    }


    public static void main(String[] args) {
        Hamxaydung_Cothamso hamxaydung_cothamso = new Hamxaydung_Cothamso("Mai","1234","TP.HCM");
        System.out.println(hamxaydung_cothamso.name);
        System.out.println(hamxaydung_cothamso.phone);
        System.out.println(hamxaydung_cothamso.address);
        Hamxaydung_Cothamso hamxaydung_cothamso1 = new Hamxaydung_Cothamso("Nhung", "2334","Long An");
        System.out.println(hamxaydung_cothamso1.name);
        System.out.println(hamxaydung_cothamso1.phone);
        System.out.println(hamxaydung_cothamso1.address);
    }

}
