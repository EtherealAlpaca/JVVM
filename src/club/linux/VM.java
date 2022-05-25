package club.linux;

import club.linux.instructions.Instruction;
import club.linux.type.Stack;

import java.util.ArrayList;
import java.util.List;

public class VM {
    public Stack stack;
    public List<Instruction> instructions = new ArrayList<>();

    public VM(List instructions) {
        this.stack = new Stack();
        this.instructions = instructions;
    }
    public void execute() {
        for (Instruction instruction : instructions) {
            instruction.exec(this);c
        }
    }
}
