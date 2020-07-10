package com.example.contactlist;

public class Contact {
    public String toString;

    private  String name;
    private  String laname;
    private  String email;
    private  int phone;


    public Contact(String name, String laname, String email, Integer phone) {
        this.name=name;
        this.laname=laname;
        this.email=email;
        this.phone=phone;

    }
    @Override
    public String toString(){
        return  "name:" +  name +"," +
                "laname:" +  laname +"," +
                "email:" +  email +"," +
                "phone:" + phone;

    }
}
