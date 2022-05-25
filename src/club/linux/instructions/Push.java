package club.linux.instructions;

import club.linux.VM;

public class Push implements IInstruction {
    long pushee;
    public Push(long pushee) {
        this.pushee = pushee;
    }
    public void exec(VM parent) {
        parent.stack.put(pushee);
        // Increment RSP
        parent.RSP.set(parent.RSP.get() + 1);
    }
    public String getName() {
        return "PUSH";
    }
    public int getOpcode() {
        return 0x00;
    }
}
