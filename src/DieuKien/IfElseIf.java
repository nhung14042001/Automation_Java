package DieuKien;

public class IfElseIf {
    public static void main(String[] args) {
        double dtb = -2;
        if (dtb > 10 || dtb < 0) {
            System.out.println("Khong hop le");
        } else {
            if (dtb >= 8) {
                System.out.println("Gioi");
            } else if (dtb < 8 && dtb >= 6.5) {
                System.out.println("Kha");
            } else if (dtb < 6.5 && dtb >= 5) {
                System.out.println("Trung binh");
            } else if (dtb < 5 && dtb > 3.5) {
                System.out.println("yeu");
            } else {
                System.out.println("O lai lop");
            }
        }
    }

}
