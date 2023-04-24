package record;

public class PersonTest {
    public static void main(String[] args) {
        Person[] per = {
                new Person("加藤","kato",22),
                new Person("木村","kimura",20),
                new Person("中村","nakamura",21),
                new Person("岡田","okada",25),
                new Person("吉田","yosida",19)
        };
        var ageMin=99;
        var ageMax=0;
        var min = 0;
        var max = 0;
        for(var i = 0;i< per.length;i++){
            if(per[i].age() < ageMin){
                ageMin = per[i].age();
                min = i;
            }
            if(per[i].age() > ageMax){
                ageMax = per[i].age();
                max = i;
            }
            //System.out.println(per[i]);
        }
        System.out.println(per[min]);
        System.out.println(per[max]);

        sortArrayAge(per);

        for(var i:per){
            System.out.println(i);
        }


    }

    public static void sortArrayAge(Person[] num){
        Person temp = new Person(null,null,0);
        for(var i = 0;i < num.length; i++){
            for(var j = num.length - 1 ;j > i;j--){
                if(num[j].age() < num[j-1].age()){
                    temp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}
