import java.util.*;

public class PizzaCrust {
    public static void main(String[] args) {
        new PizzaCrust().run();
    }

    public void run () {
        Scanner f = new Scanner(System.in);
        int r = f.nextInt();
        int d = r-f.nextInt();
        double d_a = Math.PI * d*d;
        double r_a = Math.PI * r*r;

        System.out.println(100 * d_a/r_a);

        f.close();
    }
}
