import java.util.Hashmap;
import java.util.Map;

public class HashmapEx {
    public static void main(String[] args) {
        Map<Integer,String> map=new Hashmap<>();
        Map.put(101,"giri");
        Map.put(102,"vincy");
        Map.put(103,"kaviya");
        System.out.println(Map.keySet());
        System.out.println(Map.values());
        Map.containsKey(101);
        Map.containsValue("giri");
        System.out.println(Map.get(102));
        for(Integer i: Map.keySet());{
            System.out.println(i+"-->"+Map.get());
        }
}
}