public class day8 {
    enum LANGUAGE {
        EN("English"),
        GR("German"),
        JP("Japan"),
        TA("Tamil");

        String description;

        LANGUAGE(String description) {

            this.description = description;
        }
    }

    static void main() {
        System.out.println(LANGUAGE.TA.description);
    }
}
