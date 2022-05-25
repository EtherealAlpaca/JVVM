package club.linux.instructions;

import club.linux.VM;

public interface Instruction {
    String getName();
    int getOpcode();
    void exec(VM parent);
}
