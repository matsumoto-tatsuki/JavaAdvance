package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    Map<Long,Long>cache;

    public Fibonacci(){
        this.cache = new HashMap<>();
    }

    public Fibonacci(Map<Long,Long> cache){
        this.cache = cache;
    }

    public Long calc(Long num){
        if(num <= 0){
            return 0l;
        }
        if(num == 1 || num == 2) {
            return 1l;
        }
        if(cache.containsKey(num)){
            return cache.get(num);
        }else{
            cache.put(num,calc(num -1) + calc(num -2));
        }
        return calc(num -1) + calc(num -2);
    }
}
