package WrapperClass;

class Wrap2 {
    public static void main(String[] args) {
        int a = 10;
        Integer i1 = new Integer(a); // boxing

        System.out.println(i1);
        Boolean b1 = new Boolean(true); // boxing

        System.out.println(b1);
        Integer i2 = new Integer(10);  // boxing

        System.out.println(i1 == i2); // comparing reference
        System.out.println(i1.equals(i2)); // comparing attributes
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
    }
}
