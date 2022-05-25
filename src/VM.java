import instructions.Instruction;
import instructions.Push;
import type.Stack;

import java.util.ArrayList;
import java.util.List;

public class VM {
    Stack stack;
    List<Instruction> instructions = new ArrayList<>();

    public VM() {
        this.stack = new Stack();
    }
}
