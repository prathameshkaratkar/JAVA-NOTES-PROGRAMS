package Interface;

public class InstaImp2 extends InstaImp1{
    public InstaImp2() {

    }
    InstaImp2(String name, int pwd) {
        super(name,pwd);
    }
    public void message(String msg, String name) {
        System.out.println(msg);
        System.out.println(name + " message sent !");
    }

    public void story(String info) {
        System.out.println(info);
        System.out.println("Story uploaded!");
    }
}
