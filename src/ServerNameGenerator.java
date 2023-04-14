import utils.RandomNumRange;

public class ServerNameGenerator {
    public static void main(String[] args) {
        System.out.printf("""
                          Here is your server name:
                          %s-%s
                          """, returnRandomElement(adjectives), returnRandomElement(nouns));
    }

    private static String[] adjectives = {"lying", "attractive", "shocking", "actual", "incompetent", "bouncy", "agreeable", "misty", "barbarous", "strange"};
    private static String[] nouns = {"relation", "importance", "departure", "difficulty", "classroom", "debt", "promotion", "road", "wall", "population"};

    public static String returnRandomElement(String[] array) {
        int maxElements = array.length - 1;
        int randomNumber = RandomNumRange.randomNum(0, maxElements);
        return array[randomNumber];
    }

}
