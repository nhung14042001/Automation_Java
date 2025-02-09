package VongLapFor;

public class ForAdvance {
    public static void main(String[] args) {
        int arr[] ={50,12,23,44,56,78}; //duyệt theo thứ tự trong mảng
        for (int i: arr){ //int i: Biến tạm dùng để lưu tạm từng phần từ trong mảng array
            System.out.println("Số thứ tự trả bài: "+i);
        }
        String menu []={"Customer","Dashboard","Project"};
        for (String menuName: menu){
            System.out.println(menuName);
        }
    }
}
