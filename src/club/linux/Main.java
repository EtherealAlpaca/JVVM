package club.linux;

import club.linux.instructions.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IInstruction> instructions = new ArrayList<>();

        VM vm = new VM();

        /**
         * for (int i = 0; i > 0; i--) {
         *
         * }
         */

        instructions.add(new Push(0x0F));
        instructions.add(new Pop(vm.RAX));
        instructions.add(new Dec(vm.RAX));
        instructions.add(new Jnz(-1, vm.RAX, true));

        vm.load(instructions);

        vm.execute();
    }
}
