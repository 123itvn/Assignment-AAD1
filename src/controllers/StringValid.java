package controllers;

/**
 * Created by TOAN on 12/29/2014.
 */
public class StringValid {
    public static String valid(String stringIn) {
        if (stringIn.isEmpty()) {
            //
        } else {
            stringIn = stringIn.replaceAll("\\s+", " ");
            stringIn = stringIn.replaceAll("(^\\s+|\\s+$)", "");
        }
        return stringIn;
    }
}