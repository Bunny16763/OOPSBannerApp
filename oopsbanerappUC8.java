package OOPSBannerApp;
    import java.util.HashMap;
import java.util.Map;

public class oopsbanerappUC8 {

    /**
     * Utility method to build and return the character pattern map
     * Key   -> Character
     * Value -> String array containing 7-line pattern
     */
    public static Map<Character, String[]> getCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return patternMap;
    }

    /**
     * Method to display banner message
     * @param message word to display in banner
     * @param patterns map containing character patterns
     */
    public static void displayBanner(String message, Map<Character, String[]> patterns) {

        StringBuilder lineBuilder;

        for (int i = 0; i < 7; i++) {

            lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append("   ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> characterPatterns = getCharacterPatterns();

        String message = "OOPS";

        displayBanner(message, characterPatterns);
    }
}

