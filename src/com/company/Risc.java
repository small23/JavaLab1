package com.company;

public class Risc extends Classic_proc {
    private int _conveyorLength;
    private int _commandLength;

    public Risc(String name, double price, int cores, int numberOfCommands, int frequency, int processTech, int conveyorLength, int commandLength)
    {
        super(name, price, cores, numberOfCommands, frequency, processTech);
        this._commandLength=commandLength;
        this._conveyorLength=conveyorLength;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("Conveyor length: "+this._conveyorLength+";\nCommand length: "+this._commandLength+" mops;\n");
    }

    public void setConveyorLength(int conveyorLength){this._conveyorLength=conveyorLength;};
    public int getConveyorLength(){return _conveyorLength;};

    public void setCommandLength(int commandLength){_commandLength=commandLength;};
    public int getCommandLength(){return _commandLength;};
}
