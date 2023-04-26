package collection;

import java.lang.reflect.Array;
import java.util.*;

public class ListPractice {

    public static void main(String[] args){
        System.out.println("名前を入力してください");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        List<String> list = new ArrayList<>();

        while (!s1.equals("exit")) {
            list.add(s1);
            s1 = sc.nextLine();
        }
        System.out.println("最初に入力された人：" + list.get(0));
        System.out.println("最後に入力された人：" + list.get(list.size()-1));

        System.out.println("名前で並び替えます");
        Collections.sort(list);
        for(var i:list) {
            System.out.println(i);
        }

    }
}
