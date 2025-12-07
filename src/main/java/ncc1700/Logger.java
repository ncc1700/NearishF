package ncc1700;

import java.util.Arrays;

public class Logger {
    public static final int FAIL = 1;
    public static final int PASS = 2;
    public static final int WARNING = 3;

    public static void Log(int type, String message){
        String typeString = switch(type){
            case FAIL -> "[-]";
            case PASS -> "[+]";
            case WARNING -> "[!]";
            default -> "[?]"; // INFO is also this
        };
        System.out.println(typeString + " " + message);
    }
}
