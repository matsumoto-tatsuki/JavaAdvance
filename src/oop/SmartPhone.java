package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oop2.App;

public class SmartPhone {
    Model model;
    Os os;
    Account account;
    List<AddressBook> addressBooks = new ArrayList<>();
    List<App> apps = new ArrayList<>();

    public SmartPhone(Model model,Os os){
        this.model = model;
        this.os = os;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void displayDeviceInfo(){
        System.out.println("モデル：" + model);
        System.out.println("OS：" + os);
    }

    public void displayMyAccount(){
        System.out.println("アカウント：" + account.name + "," + account.tel + "," + account.email + "," + account.address);
    }

    public boolean addAddressBook(AddressBook[] addressBook){
        if(addressBooks == null || addressBooks.isEmpty()){
            addressBooks.addAll(Arrays.asList(addressBook));
            return true;
        }else{
            return false;
        }
    }
    public void displayAppList(){
        System.out.print("apps：");
        for(var app:apps){
            System.out.print(app + " ");
        }
    }

    public void install(App[] apps){
        if(this.apps == null || this.apps.isEmpty()){
            this.apps.addAll(Arrays.asList(apps));
        }
    }
}
