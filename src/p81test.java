import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class p81test {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(5);
        set.add(3);
        set.add(1);
        System.out.println("size:"+set.size());

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(set.contains(0));
    }
}
