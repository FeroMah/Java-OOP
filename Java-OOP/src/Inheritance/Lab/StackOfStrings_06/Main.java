package Inheritance.Lab.StackOfStrings_06;

public class Main {
    public static void main(String[] args) {
        StackOfStrings sos = new StackOfStrings();
        sos.push("Fero");
        sos.push("Feri");
        sos.push("asd");
        sos.push("Beny");
        sos.push("Vlado");
        System.out.println(sos.isEmpty());
        System.out.println(sos.pop());
        System.out.println(sos.peek());

        while (!sos.isEmpty()){
            sos.pop();
        }
        System.out.println(sos.isEmpty());
    }
}
