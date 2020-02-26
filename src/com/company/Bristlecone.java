package com.company;

public class Bristlecone extends Quantum_proc {
    private double _errorRate;

    public Bristlecone(String name, double price, int qubitCount, int errorRate){
        super(name,price,qubitCount);
        this._errorRate=errorRate;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("Error rate: "+this._errorRate+";\n");
    }

    public void setErrorRate(double errorRate){this._errorRate=errorRate;};
    public double  getErrorRate(){return _errorRate;};
}
