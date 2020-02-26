package com.company;

public class Classic_proc extends Processor {
    private int _cores;
    private int _numberOfCommands;
    private double _frequency;
    private int _processTech;

    public Classic_proc(String name, double price, int cores, int numberOfCommands, int frequency, int processTech){
        super(name,price);
        this._cores=cores;
        this._frequency=frequency;
        this._numberOfCommands=numberOfCommands;
        this._processTech=processTech;
    };

    public void setFrequency(double  data){this._frequency=data;};
    public double  getFrequency(){return _frequency;};

    public void setCores(int data){this._cores=data;};
    public int getCores(){return _cores;};

    public void setNumberOfCommands(int data){this._numberOfCommands=data;};
    public int getNumberOfCommands(){return _numberOfCommands;};

    public void setProcessTech(int data){this._processTech=data;};
    public int getProcessTech(){return _processTech;};
}
