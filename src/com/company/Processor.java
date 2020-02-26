package com.company;

public class Processor {
    private String _name;
    private double _price;

    public Processor (String name, double price)
    {
        this._name=name;
        this._price=price;
    };

    public void showInfo()
    {
        System.out.print("Name: "+this._name+";\nPrice: "+this._price + " cred;\n");
    };

    public void setName (String name){
        this._name=name;
    }
    public String getName (){
        return _name;
    }

    public void setPrice (double price){
        this._price=price;
    }
    public double getPrice (){
        return _price;
    }
}
