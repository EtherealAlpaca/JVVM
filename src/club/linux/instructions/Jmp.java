package club.linux.instructions;

import club.linux.VM;

public class Jmp implements IInstruction {
    int offset;
    boolean relative;

    public Jmp(int offset, boolean relative) {
        this.offset = offset;
        this.relative = relative;
    }
    public void exec(VM parent) {
        if (relative) {
            parent.EIP.set(parent.EIP.get() + offset - 1);
        }
        else {
            parent.EIP.set(offset - 1);
        }
    }
    public String getName() {
        return "JMP";
    }
    public int getOpcode() {
        return 0x04;
    }
}
