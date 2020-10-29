public class Test {
    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        System.out.println("C0318G is valid:"+validateClassName.valadate("C0318G"));
        System.out.println("M0318G is valid:"+validateClassName.valadate("M0318G"));
        System.out.println("P0323A is valid:"+validateClassName.valadate("P0323A"));
    }
}
