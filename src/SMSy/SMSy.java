package SMSy;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class SMSy {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("src/SMSy/sms.txt"));
            FileWriter w = new FileWriter("src/SMSy/wynikSms.txt");
            while (s.hasNext()){
                String[] tab = s.nextLine().split(" ");
                System.out.println(
                        Arrays.stream(tab).map((st) ->
                                st.replaceFirst(st.charAt(0)+"", ""+Character.toUpperCase(st.charAt(0)))
                        ).toList()
                );

                w.write(Arrays.toString(tab)+"\n");
                }
            w.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
