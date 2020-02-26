package com.company;

public class Intel extends x86Supported {
    boolean _useHT;

    public Intel(String name, double price, int cores, int numberOfCommands, int frequency, int processTech,
               int conveyorLength, int commandLength, String x86InstructionSet, String commandsExtensions,
               boolean useHT)
    {
        super(name, price, cores, numberOfCommands, frequency, processTech, conveyorLength, commandLength,
                x86InstructionSet, commandsExtensions);
        this._useHT=useHT;
    };

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("Use HT: "+this._useHT+";\n");
    }

    public void setUseHT(boolean data){this._useHT=data;};
    public boolean getUseHT(){return _useHT;};
}
