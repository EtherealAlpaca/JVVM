package club.linux;

import club.linux.instructions.Instruction;
import club.linux.instructions.Push;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Instruction> instructions = new ArrayList<>();
        
        instructions.add(new Push(0x01));
        VM vm = new VM(instructions);
        vm.execute();
    }
}
