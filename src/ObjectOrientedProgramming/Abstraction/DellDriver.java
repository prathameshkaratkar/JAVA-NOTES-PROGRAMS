package ObjectOrientedProgramming.Abstraction;

public class DellDriver {
    public static void main(String[] args) {
        Dell d1 = new Windows();
        d1.welcome("Prathamesh");
        d1.OS();

        Dell d2 = new Linux();
        d2.welcome("Dhanraj");
        d2.OS();
    }
}
