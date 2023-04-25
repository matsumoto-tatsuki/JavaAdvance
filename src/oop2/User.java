package oop2;

public class User {
    String name;
    String from;
    String birthDay;

    public User(String name, String from, String birthDay){
        this.name = name;
        this.from = from;
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o){
        User user =  (User)o;
        if(user.name == this.name && user.from == this.from && user.birthDay == this.birthDay){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "名前：" + name + ", 出身地：" + from + ", 生年月日：" + birthDay;
    }

    public static void main(String[] args){
        var user = new User("aaa","bbb","ccc");
        var user2 = new User("aaa","bbb","ccc");
        System.out.println(user.equals(user2));
        System.out.println(user);
    }
}
