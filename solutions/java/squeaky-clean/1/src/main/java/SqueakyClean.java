import java.util.*;

class SqueakyClean {

    private static final String UNDERSCORE = "_";
    private static final String DASH = "-";
    
    static String clean(String identifier) {
        return replaceSpaceWithUnderscores(
            convertKebabToCamelCase(
                convertLeetSpeakToNormal(
                    removeNonLettersOrDigits(identifier)
                )
            )
        );
    }

    private static String replaceSpaceWithUnderscores(String identifier)
    {
        return identifier.replaceAll(" ", UNDERSCORE);
    }

    private static String convertKebabToCamelCase(String identifier)
    {
        String camelCased = "";
        
        char[] charArray = identifier.toCharArray();

        int kebabCharacterIndex = -1;
        
        for(int i = 0; i < charArray.length; i++) {
            if(isDash(charArray[i]))
            {
                kebabCharacterIndex = i+1;
                char kebabChar = charArray[kebabCharacterIndex];
                camelCased += String.valueOf(kebabChar).toUpperCase();
            }
            else if (i != kebabCharacterIndex)
            {
                camelCased += charArray[i];
            }
        }
        
        return camelCased;
    }

    private static String convertLeetSpeakToNormal(String identifier)
    {
        return identifier.replaceAll("4", "a")
            .replaceAll("3","e")
            .replaceAll("0", "o")
            .replaceAll("1", "l")
            .replaceAll("7","t");
    }

    private static String removeNonLettersOrDigits(String identifier)
    {
        String lettersOrDigitsOnlyIdentifier = "";
        char[] charArray = identifier.toCharArray();

        for(char ch: charArray) {
            if(isLetter(ch)) {
                lettersOrDigitsOnlyIdentifier += ch;
            }
        }

        return lettersOrDigitsOnlyIdentifier;
    }

    private static boolean isLetter(char ch)
    {
        return Character.isLetter(ch) || Character.isDigit(ch) || Character.isWhitespace(ch) || isDash(ch);
    }

    private static boolean isDash(char ch)
    {
       return DASH.equals(String.valueOf(ch));
    }
}
