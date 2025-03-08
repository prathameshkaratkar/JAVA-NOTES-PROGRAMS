package Interface;

public class InstaDriver {
    public static void main(String[] args) {
        Instagram i1 = new InstaImp2("Raju",4322);
        i1.post("Hey.. I am on Instagram. I am so Happy !");
        i1.like("Chutki");
        i1.comment("Is it?","Chutki");
        i1.message("Hey ! who are you ?","Chutki");
        i1.message("are you there ?", "Chutki");
        i1.message("Busy ?","Chutki");
        i1.story("I am alone in this World !");
        i1.comment("Is it ?","Minki");
        Instagram.welcome("Raju");
    }
}
