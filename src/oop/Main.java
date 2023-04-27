package oop;

import oop.stonegame.Player;
import oop.stonegame.StoneGame;
import oop2.App;

public class Main {

    public static void main(String[] args){
        var smartPhone = new SmartPhone(Model.iPhone,Os.ios);
        var account = new Account("matsumoto","000-0000-0000","email.com","那覇市");
        var addressBook = new AddressBook("matsumoto","000-0000-0000","email.com");

        var str = account.getAccountInfo();
        System.out.println(str);

        smartPhone.setAccount(account);

        smartPhone.displayDeviceInfo();
        smartPhone.displayMyAccount();


        AddressBook[] addressBook2 ={
                new AddressBook("aaa","111-0000-0000","email.com"),
                new AddressBook("bbb","111-0000-0000","email.com")
        };
        var bool = smartPhone.addAddressBook(addressBook2);
        System.out.println(smartPhone.addressBooks.get(0).name);

        AddressBook[] addressBook3 = {
                new AddressBook("ccc","111-0000-0000","email.com")
        };
        System.out.println(smartPhone.addressBooks.get(1).name);
        var bool2 = smartPhone.addAddressBook(addressBook3);
        System.out.println(bool2);

        System.out.println(smartPhone.addressBooks.get(0).name);


        Player[] players ={
                new Player("aaa",0),
                new Player("bbb",0)
        };

        Player[] players2 ={
                new Player("aaa",0),
                new Player("bbb",0),
                new Player("ccc",0)
        };

        var app = new App[]{
                new StoneGame(players),
                new StoneGame(players2)
        };
        smartPhone.install(app);

        smartPhone.apps.get(0).start();
        //smartPhone.displayAppList();
        //smartPhone.apps[1].start();
    }
}
