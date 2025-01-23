package ObjectOrientedProgramming.Inheritance;

class University {
    String uniname;
    int unicode;
    String uniloc;
    String vc;

    public  University(){}

    University(String uniname, int unicode, String uniloc,String vc){
        this.uniname = uniname;
        this.uniloc = uniloc;
        this.unicode = unicode;
        this.vc = vc;
    }
    public void displayUniversity(){
        System.out.println("University Code: " + unicode);
        System.out.println("University Name: " + uniname);
        System.out.println("University Loc: " + uniloc);
        System.out.println("Vice Chancellor: " + vc);
        System.out.println("==========================");
    }

}
