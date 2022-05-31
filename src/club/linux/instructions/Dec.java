package club.linux.instructions;

import club.linux.VM;
import club.linux.type.Register;

public class Dec implements IInstruction {
    Register reg;
    public Dec(Register reg) {
        this.reg = reg;
    }
    public void exec(VM parent) {
        reg.set(reg.get() - 1);
    }
    public String getName() {
        return "DEC";
    }
    public int getOpcode() {
        return 0x03;
    }
}
