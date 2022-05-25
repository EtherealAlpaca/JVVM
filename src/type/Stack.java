package type;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    public int RSP;
    private List<Object> stack = new ArrayList<>();

    public void remove(int index) {
        stack.remove(index);
    }
    public void put(Object o) {
        stack.add(o);
    }
    public Object get(int index) {
        return stack.get(index);
    }
}
