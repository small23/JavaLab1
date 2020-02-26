package com.company;

public class ArmCortexSupported extends Risc{
    private String _architectureVersion;

    public ArmCortexSupported(String name, double price, int cores, int numberOfCommands, int frequency, int processTech,
                        int conveyorLength, int commandLength, String architectureVersion)
    {
        super(name, price, cores, numberOfCommands, frequency, processTech, conveyorLength, commandLength);
        this._architectureVersion=architectureVersion;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("Architecture version: "+this._architectureVersion+";\n");
    }

    public void setArchitectureVersion (String architectureVersion){
        this._architectureVersion=architectureVersion;
    }
    public String getArchitectureVersion(){
        return _architectureVersion;
    }
}
