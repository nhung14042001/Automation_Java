package Arrays;

public class Mang_2 {
    public static void main(String[] args) {
        int number2 []={5,7,8,9,10};
        number2[2]=100; //thay đổi vị trí thứ 3 của mảng thành 100
        System.out.println("Kich co: " + number2.length);
        System.out.println(number2[4]);
        for (int i =0; i < number2.length; i++){
            System.out.println(number2[i]);
        }
    String dataCustomer [] ={"Hoa", "Hong", "Tung"};
        System.out.println(dataCustomer[0]);
        System.out.println(dataCustomer[1]);
        System.out.println(dataCustomer[2]);
        boolean check =true;
    for (int i =0; i < dataCustomer.length; i++) {
        if (dataCustomer[i].equals("Lan")){
            check = true;
            break;
        }else {
            check = false;
        }
    }
    if (check == true){
        System.out.println("Tim thay");
    }else {
        System.out.println("Khong tim thay");
    }
    }
}
