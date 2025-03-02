package Java_OOP.PhamViTruyCap.Default_01;

import Java_OOP.PhamViTruyCap.Private_01.Company;

public class Student {
    public static void main(String[] args) {
        School school = new School();
        school.getAuthentication();
        Company company = new Company();
//        company.address; (báo lỗi đang truy cập ngoài package)

    }
}
