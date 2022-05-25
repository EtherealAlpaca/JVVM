package club.linux.instructions;

import club.linux.VM;

public interface IInstruction {
    String getName();
    int getOpcode();
    void exec(VM parent);
}
