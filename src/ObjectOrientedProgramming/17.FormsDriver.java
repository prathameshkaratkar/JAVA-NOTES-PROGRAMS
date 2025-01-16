package ObjectOrientedProgramming;

class Form {
    String name;
    long mob;
    String mail;
    int yop;
    String branch;
    String degree;

    String linkedIn;
    String certificates;
    long tel;
    String blood;
    String religion;

    Form() {}
    Form(String name, long mob, String mail, int yop, String branch, String degree) {
        this.name = name;
        this.mob = mob;
        this.mail = mail;
        this.yop = yop;
        this.branch = branch;
        this.degree  = degree;
    }
    Form(String name, long mob, String mail, int yop, String branch, String degree, String linkedIn){
        this.name = name;
        this.mob = mob;
        this.mail = mail;
        this.yop  = yop;
        this.branch = branch;
        this.degree = degree;
        this.linkedIn = linkedIn;
    }
    Form(String name, long mob, String mail, int yop, String branch, String degree, String linkedIn, String certificates) {
        this.name = name;
        this.mail = mail;
        this.mob = mob;
        this.yop = yop;
        this.branch = branch;
        this.degree = degree;
        this.linkedIn = linkedIn;
        this.certificates = certificates;
    }
    Form(String name, long mob, String mail, int yop, String branch, String degree, String linkedIn, String certificates, long tel) {
        this.name= name;
        this.mob = mob;
        this.mail = mail;
        this.yop = yop;
        this.branch = branch;
        this.degree =degree;
        this.linkedIn = linkedIn;
        this.certificates = certificates;
        this.tel = tel;
    }
    Form(String name, long mob, String mail, int yop, String branch, String degree, String linkedIn, String certificates, long tel, String blood) {
        this.name= name;
        this.mob =mob;
        this.mail  = mail;
        this.yop = yop;
        this.branch = branch;
        this.degree = degree;
        this.linkedIn = linkedIn;
        this.certificates = certificates;
        this.tel = tel;
        this.blood = blood;
    }
    Form(String name, long mob, String mail, int yop, String branch, String degree, String linkedIn, String certificates, long tel, String blood, String religion){
        this.name = name;
        this.mob = mob;
        this.mail = mail;
        this.yop = yop;
        this.branch = branch;
        this.degree = degree;
        this.linkedIn = linkedIn;
        this.certificates = certificates;
        this.tel = tel;
        this.blood = blood;
        this.religion = religion;
    }

    public void displayForms() {
        System.out.println("Name: " + name);
        System.out.println("Mob: " + mob);
        System.out.println("Mail: " + mail);
        System.out.println("YOP: " + yop);
        System.out.println("Branch: " + branch);
        System.out.println("Degree: " + degree);
        System.out.println("LinkedIn: " + linkedIn);
        System.out.println("Certificates: " + certificates);
        System.out.println("Tel: " + tel);
        System.out.println("Blood Group: " + blood);
        System.out.println("Religion: " + religion);
    }

}
class FormsDriver {
    public static void main(String[] args) {
        Form f1 = new Form("Prathamesh",9157501,"prathameshkaratkar@gmail.com",2002,"computer science","B.E");
        f1.displayForms();
    }
}
