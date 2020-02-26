package com.company;

public class Quantum_proc extends Processor {
    private int _qubitCount;

    public Quantum_proc(String name, double price, int qubitCount){
        super(name,price);
        this._qubitCount=qubitCount;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("Qubit count: "+this._qubitCount+" qubits;\n");
    }

    public void setQubitCount(int QubitCount){this._qubitCount=QubitCount;};
    public int getQubitCount(){return _qubitCount;};
}
