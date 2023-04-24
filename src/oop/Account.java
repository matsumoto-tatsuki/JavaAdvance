package oop;

public class Account {
    String name;
    String tel;
    String email;
    String address;

    public Account(String name,String tel, String email, String address){
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public String getAccountInfo(){
        var str = name + "," + tel + "," + email + "," + address;
        return str;
    }
}
