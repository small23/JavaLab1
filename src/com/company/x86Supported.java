package com.company;

public class x86Supported extends Risc {
    private String _x86InstructionSet;
    private String _commandsExtentions;

    public void setCommandsExtentions (String input){
        _commandsExtentions=input;
    }
    public String getCommandsExtentions (){
        return _commandsExtentions;
    }

    public void setX86InstructionSet(String input){
        _x86InstructionSet=input;
    }
    public String getX86InstructionSet(){
        return _x86InstructionSet;
    }
}
