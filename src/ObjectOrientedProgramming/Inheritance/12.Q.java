package ObjectOrientedProgramming.Inheritance;

class Q extends P{
    String i = "Prathamesh";

    public void test(){
        System.out.println("From class B");
    }

    public void display(){
        System.out.println(super.i);
        super.test();
    }
}
