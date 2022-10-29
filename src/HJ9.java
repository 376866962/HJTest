import java.util.HashSet;
import java.util.Scanner;

public class HJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            HashSet<Integer> objects = new HashSet<>();
            int target = i;
            while(target!=0){
                int a = target %10;
                if(objects.add(a)){
                    System.out.println(a);
                    System.out.println();
                }
                target/=10;
            }
        }
    }
}
