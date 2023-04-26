import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MorseEnglishConversion {
    public static void main(String[] args) {
        System.out.println(getEnglishTextFromMorse(".... . -.--   .--- ..- -.. ."));
    }

    public static String getEnglishTextFromMorse(String morse) {
        String[] morseWords = morse.split("   ");
        List<String> morseWordChars = new ArrayList<>();
        for (int i = 0; i < morseWords.length; i++) {
            morseWordChars.add()
        }
        System.out.println(morseWords.toString());
        Map<String, Character> mapMorseToLatin = mapMorseToLatin();
        StringBuilder stringBuilder = new StringBuilder();
        for (String morseWord : morseWords) {
            stringBuilder.append(mapMorseToLatin.get(morseWord));
        }
        return stringBuilder.toString().toUpperCase();
    }

    public static String getMorseCodesFromEnglish(String text) {
        text = text.toLowerCase();
        //System.out.println(text);
        Map<Character, String> mapLatinToMorse = mapLatinToMorse();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            stringBuilder.append(mapLatinToMorse.get(text.charAt(i)));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static Map<String, Character> mapMorseToLatin() {
        Map<Character, String> mapLatinToMorse = mapLatinToMorse();
        Map<String, Character> mapMorseToLatin = new HashMap<>();
        for (Map.Entry<Character, String> entry : mapLatinToMorse.entrySet()) {
            mapMorseToLatin.put(entry.getValue(), entry.getKey());
        }
        return mapMorseToLatin;
    }

    public static Map<Character, String> mapLatinToMorse() {
        Map<Character, String> mapLatinToMorse = new HashMap<Character, String>();
        mapLatinToMorse.put('a', ".-");
        mapLatinToMorse.put('b', "-...");
        mapLatinToMorse.put('c',  "-.-");
        mapLatinToMorse.put('d',  "-..");
        mapLatinToMorse.put('e',    ".");
        mapLatinToMorse.put('f', "..-.");
        mapLatinToMorse.put('g',  "--.");
        mapLatinToMorse.put('h', "....");
        mapLatinToMorse.put('i',   "..");
        mapLatinToMorse.put('j', ".---");
        mapLatinToMorse.put('k',   "-.");
        mapLatinToMorse.put('l', ".-..");
        mapLatinToMorse.put('m',   "--");
        mapLatinToMorse.put('n',   "-.");
        mapLatinToMorse.put('o',  "---");
        mapLatinToMorse.put('p', ".--.");
        mapLatinToMorse.put('q', "--.-");
        mapLatinToMorse.put('r', ".-.");
        mapLatinToMorse.put('s',  "...");
        mapLatinToMorse.put('t',   "-");
        mapLatinToMorse.put('u',  "..-");
        mapLatinToMorse.put('v', "...-");
        mapLatinToMorse.put('w',  ".--");
        mapLatinToMorse.put('x', "-..-");
        mapLatinToMorse.put('y', "-.--");
        mapLatinToMorse.put('z', "--..");
        mapLatinToMorse.put('1', ".----");
        mapLatinToMorse.put('2',"..---");
        mapLatinToMorse.put('3', "...--");
        mapLatinToMorse.put('4', "....-");
        mapLatinToMorse.put('5', ".....");
        mapLatinToMorse.put('6', "-....");
        mapLatinToMorse.put('7', "--...");
        mapLatinToMorse.put('8', "---..");
        mapLatinToMorse.put('9', "----.");
        mapLatinToMorse.put('0', "-----");
        mapLatinToMorse.put(' ', " ");

        return mapLatinToMorse;
    }
}