package record;


record Person(String name, String huri, int age) implements Comparable<Person> {
   @Override
   public int compareTo(Person o) {
      return age - o.age;
   }
}

