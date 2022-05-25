package club.linux;

import club.linux.instructions.IInstruction;
import club.linux.type.Register;
import club.linux.type.Stack;

import java.util.ArrayList;
import java.util.List;

public class VM {
    public Stack stack;

    //Registers
    public Register RAX = new Register();
    public Register RBX = new Register();
    public Register RCX = new Register();
    public Register RDX = new Register();

    public Register RSP = new Register();

    public List<IInstruction> instructions = new ArrayList<>();

    public VM() {
        this.stack = new Stack();
        //No values on the stack
        RSP.set(-1);
    }
    public void load(List instructions) {
        this.instructions = instructions;
    }
    public void execute() {
        for (IInstruction instruction : instructions) {
            instruction.exec(this);
        }
    }
}
