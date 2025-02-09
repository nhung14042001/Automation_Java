package Ham;

public class PhuongThuc {
    public double sum;
    public double res;
    //Ham.Ham khong tra ve ket qua

    public void cong2so() {
    int a=5;
    int b =10;
    sum = a+ b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        PhuongThuc phuongthuc =new PhuongThuc();
        phuongthuc.cong2so();
        System.out.println(phuongthuc.sum);

    }
    }