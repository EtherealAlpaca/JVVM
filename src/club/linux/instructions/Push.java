package club.linux.instructions;

import club.linux.VM;
import club.linux.type.Stack;

public class Push implements Instruction {
    Object pushee;
    public Push(Object pushee) {
        this.pushee = pushee;
    }
    public void exec(VM parent) {
        parent.stack.put(pushee);
    }
    public String getName() {
        return "push";
    }
    public int getOpcode() {
        return 0x00;
    }
}
