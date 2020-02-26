package com.company;

public class Risc extends Classic_proc {
    private int _conveyorLength;
    private int _commandLength;

    public void setConveyorLength(int data){_conveyorLength=data;};
    public int getConveyorLength(){return _conveyorLength;};

    public void setCommandLength(int data){_commandLength=data;};
    public int getCommandLength(){return _commandLength;};
}
