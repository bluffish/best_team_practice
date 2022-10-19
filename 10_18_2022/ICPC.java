import java.util.*;
import java.io.*;
public class ICPC {

    public void run()throws Exception
    {
        Scanner f = new Scanner(System.in);
        int times = f.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < times; i++) {
            String a = f.next();
            String b = f.next();
            if(set.size() == 12)
            {
                break;
            }
            if(!set.contains(a))
            {
                set.add(a);
                System.out.println(a + " " + b);
            }
        }
    }

    public static void main(String[] args)throws Exception
    {
        new ICPC().run();
    }

}
