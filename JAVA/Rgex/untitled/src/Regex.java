import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String IP = sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{

    String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    public String pattern = ip0to255+ "\\." + ip0to255 + "\\." +ip0to255 + "\\." + ip0to255;
}