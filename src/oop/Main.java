package oop;

public class Main {

    public static void main(String[] args){
        var smartPhone = new SmartPhone("iPhone","ios");
        var account = new Account("matsumoto","000-0000-0000","email.com","那覇市");
        var addressBook = new AddressBook("matsumoto","000-0000-0000","email.com");

        var str = account.getAccountInfo();
        System.out.println(str);

        smartPhone.setAccount(account);
        smartPhone.displayDeviceInfo();
        smartPhone.displayMyAccount();


        AddressBook[] addressBook2 ={new AddressBook("aaa","111-0000-0000","email.com"),
                new AddressBook("bbb","111-0000-0000","email.com")};
        var bool = smartPhone.addAddressBook(addressBook2);
        System.out.println(bool);

        AddressBook[] addressBook3 = {new AddressBook("ccc","111-0000-0000","email.com")};
        var bool2 = smartPhone.addAddressBook(addressBook3);
        System.out.println(bool2);

        System.out.println(smartPhone.addressBooks[0].name);

        for (var i = 0;i < smartPhone.addressBooks.length;i++){
            System.out.println(smartPhone.addressBooks[i].name);
        }

        var app = new String[]{"line","aaa"};
        smartPhone.installApps(app);
        smartPhone.displayAppList();



    }
}
