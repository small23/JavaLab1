package com.company;

public class Vliw extends Classic_proc{
    private int _IPC;

    public Vliw (String name, double price, int cores, int numberOfCommands, int frequency, int processTech, int IPC)
    {
        super(name, price, cores, numberOfCommands, frequency, processTech);
        this._IPC=IPC;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("IPC: "+this._IPC+";\n");
    }

    public void setInProcThreads(int IPC){this._IPC=IPC;};
    public int getInProcThreads(){return _IPC;};
}
