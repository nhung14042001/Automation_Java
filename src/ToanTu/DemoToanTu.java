package ToanTu;

public class DemoToanTu {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c = 5;
        //Toán tử số học
        System.out.println("a/b="+ a/b);
        System.out.println("a%b=" + a%b);
        System.out.println(a++); //a = a+1
        System.out.println(a);
        System.out.println(a+= 5); //a =a + 5
        //Toán tử so sánh
        System.out.println("So sánh a >b: "+ (a >b));
        System.out.println("so sánh hoặc: "+((a>b)||(b>c)));
        System.out.println("so sánh và: "+((a>b)&&(b>c)));
        System.out.println("xuất kết quả: " + ((a>b) &&(b>c)||(a>c)&&(b<c)));

    }
}
