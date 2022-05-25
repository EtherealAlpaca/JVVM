package instructions;

public interface Instruction {
    String getName();
    int getOpcode();
    void exec();
}
