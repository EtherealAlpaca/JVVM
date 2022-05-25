package club.linux.instructions;

import club.linux.VM;
import club.linux.type.Register;

public class Pop implements IInstruction {
    Register dst;
    public Pop(Register dst) {
        this.dst = dst;
    }
    public void exec(VM parent) {
        //Move value from top of stack into register
        this.dst.set(parent.stack.get((int) parent.RSP.get()));
        //Remove value from top of stack
        parent.stack.remove((int) parent.RSP.get());
        //Decrement RSP
        parent.RSP.set(parent.RSP.get() - 1);
    }
    public String getName() {
        return "POP";
    }
    public int getOpcode() {
        return 0x01;
    }
}
