package OOPSBannerApp;

public class oopsbannerappUC6 {
       // Helper method to build pattern for letter O
    static String getOPattern() {
        return String.join("\n",
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** ");
    }

    // Helper method to build pattern for letter P
    static String getPPattern() {
        return String.join("\n",
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    ");
    }

    // Helper method to build pattern for letter S
    static String getSPattern() {
        return String.join("\n",
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** ");
    }

    public static void main(String[] args) {

        // Array initialization using methods
        String[] banner = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        // Loop to display banner
        for (String letter : banner) {
            System.out.println(letter);
            System.out.println(); // space between letters
        }
    }
}

