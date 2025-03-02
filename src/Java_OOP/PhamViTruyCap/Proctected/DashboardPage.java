package Java_OOP.PhamViTruyCap.Proctected;

import Java_OOP.Package_02.Package_2A.BasePage;
public class DashboardPage {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
//        loginPage.inputEmail; (nếu chỉ gọi cái biến ra mà không làm gì hết thì sẽ báo lỗi)
        System.out.println(loginPage.inputEmail);
        System.out.println(loginPage.inputPassword);
        BasePage basePage = new BasePage();
//        basePage.name; (không thể gọi do name đang nằm ngoài package, có thể gọi thông qua kế thừa)
    }

}
