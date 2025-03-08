package Interface;

class I1Driver {
    public static void main(String[] args) {
        I1 i = new I1Imp();
        i.test();
        i.demo();
        i.demo2();

        System.out.println(I1.s);
    }
}
