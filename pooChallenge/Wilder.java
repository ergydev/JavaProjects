public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String whoAmI() {
        return "Je m'appelle " + this.firstname + " et je suis " + (this.aware ? "aware" : "not aware");
    }

    public static void main(String[] args){
        Wilder diego = new Wilder("Diego", true);
        Wilder samantha = new Wilder("Samantha", false);
    }
}

