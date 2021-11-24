
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader
                (new InputStreamReader(System.in));
        String kons = "bcdfghjklmnqprstvxzBCDFGHJKLMNQPRSTVXZ";
        while (true) {
            String s1 = input.readLine();
            if (s1 == null)
                break;
            String s2 = "";

            for (int i=0;i< s1.length(); i++ ) {
                char c = s1.charAt(i);
                s2 = s2 + c;
                if (kons.indexOf (c)>=0)
                    s2 = s2 + "o" + c;
            }
            System.out.println(s2);
        }
    }
}