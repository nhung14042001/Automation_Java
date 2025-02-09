package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        Set <String> menu =new HashSet<>();
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Project");
        menu.add("Tasks");
        menu.add("Sales");
        System.out.println(menu.contains("Tasks"));
        System.out.println(menu.remove("Sales"));
        System.out.println(menu.size());
        System.out.println("Cac phan tu cua Set:");
        System.out.println("\t"+ menu  +"\n");
        System.out.println("\n=====================");
        //Duyệt giá trị trong SET
        // Show set through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
//            System.out.print(itr.next() + ", ");
            System.out.println(itr.next());
        }
        // Show set through for-each
        System.out.println("\n=====================");
        System.out.println();
        for (String obj : menu) {
//            System.out.print(obj + ", ");
            System.out.println(obj);
        }


    }
}
