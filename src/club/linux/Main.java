package club.linux;

import club.linux.instructions.IInstruction;
import club.linux.instructions.Pop;
import club.linux.instructions.Push;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IInstruction> instructions = new ArrayList<>();

        VM vm = new VM();

        instructions.add(new Push(0x03));
        instructions.add(new Pop(vm.RAX));

        vm.load(instructions);

        vm.execute();
    }
}
