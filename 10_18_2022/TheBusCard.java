import java.util.*;

public class TheBusCard {
    public static void main(String[] args) {
        new TheBusCard().run();
    }

    public void run () {
        Scanner f = new Scanner(System.in);

        TreeMap<Integer, Integer> ts = new TreeMap<>();
        ts.put(100, 1);
        ts.put(200, 1);
        ts.put(300, 2);
        ts.put(400, 2);
        ts.put(500, 1);

        int n = f.nextInt();
        int count = 0;

        while (n > 0) {
            Integer temp = ts.ceilingKey(n);
//            System.out.println(temp);
            if (temp == null) {
                n -= 500;
                count++;
            } else {
                n -= temp;
                count += ts.get(temp);

            }
        }
        System.out.println(count);
//        System.out.println(n);
        f.close();
    }
}
