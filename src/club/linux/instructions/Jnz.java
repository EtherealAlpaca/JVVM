package club.linux.instructions;

import club.linux.VM;
import club.linux.type.Register;

public class Jnz implements IInstruction {
    int offset;
    Register reg;
    boolean relative;

    public Jnz(int offset, Register reg, boolean relative) {
        this.offset = offset;
        this.reg = reg;
        this.relative = relative;
    }
    public void exec(VM parent) {
        if (reg.get() != 0) {
            if (relative) {
                parent.EIP.set(parent.EIP.get() + offset - 1);
            }
            else {
                parent.EIP.set(offset - 1);
            }
        }

    }
    public String getName() {
        return "JNZ";
    }
    public int getOpcode() {
        return 0x05;
    }
}
