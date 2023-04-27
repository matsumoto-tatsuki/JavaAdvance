package function;

import javax.lang.model.element.NestingKind;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionObjectPractice {
    public static void main(String[] args){
        Predicate<Integer> a =(n1) -> {
            if (n1 % 2 == 0){
                return true;
            }
            return false;
        };
        System.out.println(a.test(6));

        Function<String,String> b = (String str) ->{
            StringBuilder sb = new StringBuilder(str);
            String reversedStr = sb.reverse().toString();

            return reversedStr;
        };
        System.out.println(b.apply("Hello"));


        Function<String,String[]> c = (String str) ->{
            String[] s = str.split(",");
            return s;
        };
        for(var i:c.apply("H,e,l,l,o")){
            System.out.print(i);
        }
        System.out.println();

        UnaryOperator<Integer> d =(n1) ->{
            for(var i = 0;i<2;i++){
                n1 *= 2;
            }
            return n1;
        };
        System.out.println(d.apply(5));

        BiFunction<String,Integer,String> e = (s1,n1) ->{
            String str = s1;
            for(var i = 0;i < n1;i++){
                str += s1;
            }
            return str;
        };
        System.out.println(e.apply("Hello",2));
    }
}
