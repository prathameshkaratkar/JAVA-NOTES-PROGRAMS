package Interface;

public interface Instagram {
    void post(String info);
    public void comment(String cmt, String name);
    void like(String name);
    public abstract void follow(String name);
    public static void welcome(String name) {
        System.out.println("Hey ! " + name+ "Welcome to Insta life");
    }
    void message(String msg, String name);
    void story(String info);
}
