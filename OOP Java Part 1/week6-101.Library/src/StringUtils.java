
public class StringUtils {
    public static boolean included(String word, String searched) {
        if (word.isEmpty() || searched.isEmpty()) {
            return false;
        }
        String upperCasedWord = word.toUpperCase();
        String trimedString = searched.trim().toUpperCase();
        return upperCasedWord.contains(trimedString);
    }  
}
