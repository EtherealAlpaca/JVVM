package instructions;

import type.Stack;

public class Push implements Instruction {
    Stack stack;
    Object pushee;
    public Push(Object pushee, Stack stack) {
        this.stack = stack;
        this.pushee = pushee;
    }
    public void exec() {
        stack.put(pushee);
    }
    public String getName() {
        return "push";
    }
    public int getOpcode() {
        return 0x00;
    }
}
