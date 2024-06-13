public class Classroom{
    public static void main(String[] args) {
        Wilder diego = new Wilder("Diego", true);
        Wilder samantha = new Wilder("Samantha", false);
        System.out.println(diego.whoAmI());
        System.out.println(samantha.whoAmI());
    }
}
