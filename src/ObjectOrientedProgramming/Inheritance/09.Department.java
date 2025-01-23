package ObjectOrientedProgramming.Inheritance;

class Department extends College{
    String name;
    String hod;
    int std;
    int lec;

    public Department(){}

    Department(String uniname, int unicode, String uniloc, String vc, String colname
    , String colloc, String principle, int colcode, String naac, String type, String name, String hod, int std, int lec){
        this.uniname = uniname;
        this.unicode = unicode;
        this.uniloc = uniloc;
        this.vc = vc;

        this.colname = colname;
        this.colloc = colloc;
        this.principle = principle;
        this.colcode = colcode;
        this.naac = naac;
        this.type = type;

        this.name = name;
        this.hod = hod;
        this.std = std;
        this.lec = lec;
    }

    public void displayDepartment(){
        displayCollege();
        System.out.println("Dept Name: " + name);
        System.out.println("Dept HOD: " + hod);
        System.out.println("No. of Student: " + std);
        System.out.println("NNo of Lectures: " + lec);
        System.out.println("====================");
    }

}
