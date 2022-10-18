import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Character.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Imperial{

	public void run() throws Exception{
		Map<String,Integer> map = new HashMap<>();
		map.put("thou",1);
		map.put("th",1);
		map.put("inch", 1000 * map.get("th"));
		map.put("in",1000 * map.get("th"));
		map.put("foot", 12 * map.get("in"));
		map.put("ft", 12 * map.get("in"));
		map.put("yard", 3 * map.get("ft"));
		map.put("yd", 3 * map.get("ft"));
		map.put("chain", 22 * map.get("yd"));
		map.put("ch", 22 * map.get("yd"));
		map.put("furlong", 10 * map.get("ch"));
		map.put("fur", 10 * map.get("ch"));
		map.put("mile", 8 * map.get("fur"));
		map.put("mi", 8 * map.get("fur"));
		map.put("league", 3 * map.get("mi"));
		map.put("lea", 3 * map.get("mi"));

	    //Scanner f = new Scanner(new File("Imperial.dat"));
	    Scanner f = new Scanner(System.in);

		String[] line = f.nextLine().trim().split(" ");

		double val = Double.parseDouble(line[0]);
		System.out.print(val * map.get(line[1])/map.get(line[3]));

        f.close();

	}
	public static void main(String[] args) throws Exception{

	new Imperial().run();

	}
}
