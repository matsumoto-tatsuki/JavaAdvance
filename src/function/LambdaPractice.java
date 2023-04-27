package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.stream;

record Student(String name, int score){};
public class LambdaPractice {

    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("aaa",50));
        students.add(new Student("bbb",88));
        students.add(new Student("ddd",12));
        students.add(new Student("xxx",67));
        students.add(new Student("zzz",100));

        var sum = 0;
        for(var student:students){
            sum += student.score();
        }
        System.out.println(sum);

        sum = students.stream().mapToInt(w -> w.score()).sum();
        System.out.println(sum);

        students.stream().filter(s -> s.score() >= 80).forEach(System.out::println);

        System.out.println();

        students.stream()
                .sorted(Comparator.comparing(Student::score).reversed())
                .forEach(System.out::println);
    }

}
