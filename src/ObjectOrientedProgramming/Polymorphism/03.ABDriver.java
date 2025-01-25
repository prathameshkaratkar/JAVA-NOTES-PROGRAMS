package ObjectOrientedProgramming.Polymorphism;

class ABDriver {
    public static void main(String[] args) {
        A a1 = new B();   // Upcasting
        a1.best();
        a1.worst();
    }
}
