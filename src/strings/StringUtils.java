package strings;

public class StringUtils {

    public static String reverse(String text) {
        return ReverseString.reverse(text);
    }

    public static String toLowerCase(String text) {
        return ToLowerCaseManual.toLowerCase(text);
    }

    public static String removeSpaces(String text) {
        return RemoveSpaces.removeSpaces(text);
    }

    public static String trim(String text) {
        return TrimManual.trim(text);
    }
}
