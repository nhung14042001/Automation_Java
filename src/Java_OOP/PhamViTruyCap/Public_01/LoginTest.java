package Java_OOP.PhamViTruyCap.Public_01;

import Java_OOP.PhamViTruyCap.Proctected.LoginPage;

public class LoginTest {
    public static void main(String[] args) {
ConfigData configData =new ConfigData();
        System.out.println(configData.Browser);
        LoginPage loginPage = new LoginPage();
        System.out.println(loginPage.button);
    }
}
