package club.linux.type;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Long> stack = new ArrayList<>();
    public void remove(int index) {
        stack.remove(index);
    }
    public void put(Long l) {
        stack.add(l);
    }
    public long get(int index) {
        return stack.get(index);
    }
}
