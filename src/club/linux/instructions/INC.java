package club.linux.instructions;

import club.linux.VM;
import club.linux.type.Register;

public class INC implements IInstruction {
    Register reg;
    public INC(Register reg) {
        this.reg = reg;
    }
    public void exec(VM parent) {
        reg.set(reg.get() + 1);
    }
    public String getName() {
        return "INC";
    }
    public int getOpcode() {
        return 0x02;
    }
}
