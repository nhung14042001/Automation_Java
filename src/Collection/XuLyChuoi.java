package Collection;

import java.security.SecureRandom;

public class XuLyChuoi {
    public static void main(String[] args) {
        String s1 ="qwertAuio Dfghjk cvbnm, fgHjk rTgyui fghjk";
        String s2 = "ertyuiolkBhg ghjkWhgf fghjknbvDg vbnm,";
        //Cắt chuỗi
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(5,10));
        //Ghép chuỗi
        System.out.println(s1+" "+s2);
        // Chuyển kiểu chữ in hoa và in thường
        System.out.println(s1.toLowerCase()); //Chu thuong
        System.out.println(s2.toUpperCase()); // Chu in hoa
        //Xao ky tu khoang trang 2 dau
        String s3 = " test automation ";
        System.out.println(s3.trim());
        //Độ dài chuỗi
        System.out.println("Độ dài chuỗi" +s2.length());

        //Tìm kiếm ký tự
        System.out.println(s1.charAt(5));
        System.out.println(s1.indexOf("rTgyui"));
        // dem tu so 0 tro len
        //So sánh chuỗi
        //+ So sanh bằng
        String s4 =" Test Automation";
        String s5 = "Test Automation ";
        System.out.println(s4.equals(s5));
        //+ So sánh chứa
        System.out.println(s4.contains("Automation"));
        // So sánh bỏ qua in hoa và in thường
        System.out.println(s4.equalsIgnoreCase(s3));
        System.out.println(s5.equalsIgnoreCase(s3));

    }
}
