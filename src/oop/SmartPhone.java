package oop;

public class SmartPhone {
    String model;
    String os;
    Account account;
    AddressBook[] addressBooks;
    String[] apps;

    public SmartPhone(String model,String os){
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
        if(addressBooks == null){
            this.addressBooks = addressBook;
            return true;
        }else{
            return false;
        }
    }
    public void displayAppList(){
        System.out.print("apps：");
        for(var ap:apps){
            System.out.print(ap + " ");
        }
    }

    public void installApps(String[] app){
        this.apps = app;
    }
}
