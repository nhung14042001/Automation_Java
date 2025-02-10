package Arrays;

public class Mang_1 {
    public static void main(String[] args) {
        //khai báo mảng rỗng, chưa mang giá trị
        int number1 []= new int[6];
        // Gán giá trị cho mảng
//        number1[0]=40;
//        number1[1]=20;
//        number1[2]=10;
//        number1[3]=50;
//        number1[4]=5;
//        number1[5]=10;
        System.out.println("Độ dài mảng = " + number1.length);
        System.out.println("===================");
        System.out.println(number1[3]);
        System.out.println("===================");
        // Duyệt mảng để lấy giá trị ra => sử dụng vòng lặp for
        for (int i =0; i < number1.length; i ++){
            System.out.println(number1[i]); // truy suất giá trị từ vị trí thứ mấy
        }
        System.out.println("===================");
        for (int i =4; i < number1.length; i ++){
            System.out.println(number1[i]); // truy suất giá trị từ vị trí thứ mấy
        }
        System.out.println("===================");
        for (int number : number1){
            System.out.println(number);
        }
    }
}
