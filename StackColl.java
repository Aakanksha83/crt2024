import java.util.*;
class StackColl {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("A");
        s.push("x");
        s.push("B");
        s.push("y");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search("a"));
        System.out.println(s.search("x"));
        System.out.println(s.empty());
    }
}