import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern p = Pattern.compile( "(?<!\\S)" + "((25[0-5]|2[0-4]\\d|1\\d\\d|\\d?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d\\d|\\d?\\d)" + "(?!\\S)");
        Matcher m = p.matcher(str);

        if (m.find()){
            System.out.println(m.group());
        }
        else
            System.out.println("Не найдено");
    }
}