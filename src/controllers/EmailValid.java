package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by TOAN on 12/29/2014.
 */
public class EmailValid {
    private String pattern;

    public EmailValid(String pattern) {
        this.pattern = pattern;
    }

    public boolean validate(String value) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(value);
        return m.matches();
    }
}
