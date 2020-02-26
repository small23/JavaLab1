package com.company;

public class Classic_proc extends Processor {
    private int _cores;
    private int _numberOfCommands;
    private double _frequency;
    private int _processTech;

    public void setFrequency(double  data){_frequency=data;};
    public double  getFrequency(){return _frequency;};

    public void setCores(int data){_cores=data;};
    public int getCores(){return _cores;};

    public void setNumberOfCommands(int data){_numberOfCommands=data;};
    public int getNumberOfCommands(){return _numberOfCommands;};

    public void setProcessTech(int data){_processTech=data;};
    public int getProcessTech(){return _processTech;};
}
