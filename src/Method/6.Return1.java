package Method;

class Return1 {
    public static void main(String[] args) {
        System.out.println("Main Begin");
        int ans = add(10,20);
        System.out.println(ans);
        System.out.println("Main End");
    }
    public static int add(int a, int b){
        System.out.println("Add Begin");
        int res = a + b;

        System.out.println("Add End");
        return res;

    }
}
