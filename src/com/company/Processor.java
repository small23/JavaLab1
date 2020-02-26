package com.company;

public class Processor {
    private String _name;
    private double _price;

    public void setName (String input){
        _name=input;
    }
    public String getName (){
        return _name;
    }

    public void setPrice (double input){
        _price=input;
    }
    public double getPrice (){
        return _price;
    }
}
