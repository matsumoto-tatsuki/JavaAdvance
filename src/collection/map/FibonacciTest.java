package collection.map;

import java.util.HashMap;
import java.util.Map;

public class FibonacciTest {


    public static void main(String[] args){
        Map<Long,Long>cache = new HashMap<>();

        Long[] hash = {1l,1l,2l,1l,3l,2l,4l,3l,5l,5l,6l,8l,7l,13l,8l,21l,9l,34l,10l,55l};
        for(var i = 0;i < hash.length-1;i+=2){
            cache.put(hash[i],hash[i + 1]);
        }

        var f = new Fibonacci();
        System.out.println(f.calc(1000l));

        var f2 = new Fibonacci(cache);
        System.out.println(f2.calc(1000l));
    }
}
