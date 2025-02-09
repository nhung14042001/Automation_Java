package Collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {
        //khai bao kieu du lieu Map
        //Khong luu duoc 2 key trung lap
        Map<String, String> map = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();
        //Them du lieu
        map.put("language","Java");
        map.put("framework","TestNG");
        map.put("Library","Selenium");
        map2.put(1,1.6);
        map2.put(2,222D);
        System.out.println("Map 1: "+ map);
        System.out.println("Map 2: "+ map2);
// Duyệt map
        System.out.println(map.containsKey("language"));
        System.out.println(map.containsValue("Java"));
        map.remove("Library");
//Duyệt kiểu dữ liệu Map
        //Get hêt giá trị của key và value
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
