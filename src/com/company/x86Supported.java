package com.company;

public class x86Supported extends Risc {
    private String _x86InstructionSet;
    private String _commandsExtensions;

    public x86Supported(String name, double price, int cores, int numberOfCommands, int frequency, int processTech,
                int conveyorLength, int commandLength, String x86InstructionSet, String commandsExtensions)
    {
        super(name, price, cores, numberOfCommands, frequency, processTech, conveyorLength, commandLength);
        this._x86InstructionSet=x86InstructionSet;
        this._commandsExtensions =commandsExtensions;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("X86 instruction set: "+this._x86InstructionSet+";\nCommands extensions: "+this._commandsExtensions +";\n");
    }

    public void setCommandsExtensions (String commandsExtensions){
        this._commandsExtensions =commandsExtensions;
    }
    public String getCommandsExtensions (){
        return _commandsExtensions;
    }

    public void setX86InstructionSet(String x86InstructionSet){
        this._x86InstructionSet=x86InstructionSet;
    }
    public String getX86InstructionSet(){
        return _x86InstructionSet;
    }
}
