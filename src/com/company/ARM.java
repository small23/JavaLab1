package com.company;

public class ARM extends ArmCortexSupported{
    boolean _useBiglittle;

    public ARM(String name, double price, int cores, int numberOfCommands, int frequency, int processTech,
                              int conveyorLength, int commandLength, String architectureVersion, boolean useBiglittle)
    {
        super(name, price, cores, numberOfCommands, frequency, processTech, conveyorLength, commandLength, architectureVersion);
        this._useBiglittle=useBiglittle;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("bigLittle architecture: "+this._useBiglittle+";\n");
    }

    public void setUseBiglittle(boolean useBiglittle){this._useBiglittle=useBiglittle;};
    public boolean getUseBiglittle(){return _useBiglittle;};
}
