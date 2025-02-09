package ToanTu;

public class ToanTutest {
    public double sum;
    public double res;
public void phuongThucHam(){
    int a = 10;
    int b = 20;
    int c = 5;
    int d = a + b - c;
    res = d;
    System.out.println(res);
}
public double nhan2so(){
    int a = 5;
    int b = 10;
    sum = a * b;
    return sum;
}
    public static void main(String[] args) {
    ToanTutest toan = new ToanTutest();
    toan.phuongThucHam();
        System.out.println(toan.sum);
        //Toán tử só học

    }
}
