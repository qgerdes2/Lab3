import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class CS125Lab3 {

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        // Starting from scratch Lab 3
        String websiteString = urlToString("http://erdani.com/tdpl/hamlet.txt");
        String [] words = websiteString.split(" ");
        int wordCount = words.length;
        System.out.println(wordCount);






    }

}
