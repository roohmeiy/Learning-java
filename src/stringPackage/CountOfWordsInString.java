package stringPackage;

public class CountOfWordsInString {
    void countWords(String line) {
        String[] words = line.split("\\s+");
        System.out.println(words.length);
    }

}
