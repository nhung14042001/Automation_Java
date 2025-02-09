package SwitchCase;

public class SwitchCase_1 {
    public static void main(String[] args) {
        int number =10;
        switch (number){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Note in 10,20,30");
        }
        String browser = " Chrome ";
        //- Hàm chuyển chuỗi về chữ thường: toLowersCase()
        //- Hàm chuyển chuỗi về in hoa: to UpperCase()
        //- Hàm cắt bỏ khoảng trắng 2 đầu của chuỗi: trim(
        switch (browser.toLowerCase().trim()){
            case "chrome":
                System.out.println("Test voi trinh duyet Chrome");
                break;
            case"edge":
                System.out.println("Test voi trinh duyet Edge");
                break;
            case "firefox":
                System.out.println("Test voi trinh duyet firefox");
                break;
            default:
                System.out.println("Khong roi vao case nao het");
        }
    }
}
