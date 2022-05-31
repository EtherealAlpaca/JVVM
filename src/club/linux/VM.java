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

    public Register EIP = new Register();

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
        // For loop abuse
        // I know it looks bad, but its closest to how it works in a CPU. I should have written this in C ): I miss pointers.
        for (EIP.get(); EIP.get() < instructions.size(); EIP.set(EIP.get() + 1)) {
            instructions.get((int) EIP.get()).exec(this);
            System.out.println(RAX.get());
        }
    }
}
