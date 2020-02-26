package com.company;

public class Elbrus extends Vliw {
    private boolean _supportX86OperandsViaOS;

    public Elbrus (String name, double price, int cores, int numberOfCommands, int frequency, int processTech,
                   int inProcThreads, boolean supportX86OperandsViaOS)
    {
        super(name, price, cores, numberOfCommands, frequency, processTech, inProcThreads);
        this._supportX86OperandsViaOS=supportX86OperandsViaOS;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("Support X86 operands via OS: "+this._supportX86OperandsViaOS+";\n");
    }

    public void setSupportX86OperandsViaOS(boolean supportX86OperandsViaOS){this._supportX86OperandsViaOS=supportX86OperandsViaOS;};
    public boolean getSupportX86OperandsViaOS(){return _supportX86OperandsViaOS;};
}
