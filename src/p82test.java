import java.util.HashMap;
import java.util.Map;

public class p82test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("wangyu",22);
        map.put("liujingyu",22);
        map.put("liuxuanyu",10);

        System.out.println(map.get("wangyu"));
        System.out.println(map);
    }
}
