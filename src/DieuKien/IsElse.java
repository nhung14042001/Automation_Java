package DieuKien;

public class IsElse {
    public static void main(String[] args) {
        String gender ="Male";
        int age =30;

        if (gender.equals("Female")||age < 30){
            System.out.println("Di cuoc dat");
        }else{
            System.out.println("Di hai rau");
        }
    }
}