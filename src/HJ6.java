import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (sc.hasNext()){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                map.put(a, map.getOrDefault(a, 0) + b);
            }
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
//            while (iterator.hasNext()){
//                Map.Entry<Integer, Integer> entry = iterator.next(1);
//                System.out.println(entry.getKey()+" "+entry.getValue());
//            }
        }
    }
}
