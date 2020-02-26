package com.company;

public class ArmCortexSupported extends Risc{
    private String _architectureVersion;

    public void setArchitectureVersion (String input){
        _architectureVersion=input;
    }
    public String getArchitectureVersion(){
        return _architectureVersion;
    }
}
