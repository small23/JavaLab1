package com.company;

public class AMD extends x86Supported {
    boolean _useSMT;
    boolean _clusterComposition;

    public AMD(String name, double price, int cores, int numberOfCommands, int frequency, int processTech,
               int conveyorLength, int commandLength, String x86InstructionSet, String commandsExtentions,
               boolean useSMT, boolean clusterComposition)
    {
        super(name, price, cores, numberOfCommands, frequency, processTech, conveyorLength, commandLength,
                x86InstructionSet, commandsExtentions);
        this._useSMT=useSMT;
        this._clusterComposition=clusterComposition;
    };

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("Use SMT: "+ this._useSMT+";\nCluster composition: "+this._clusterComposition+";\n");
    }

    public void setUseSMT(boolean useSMT){this._useSMT=useSMT;};
    public boolean getUseSMT(){return _useSMT;};

    public void setClusterComposition(boolean clusterComposition){this._clusterComposition=clusterComposition;};
    public boolean getClusterComposition(){return _clusterComposition;};
}
