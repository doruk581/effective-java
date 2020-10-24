package com.doruk.tutorials.construction.strings;

import java.util.regex.Pattern;

public class PatternMatcher {

    //it's not suitable for repeated use in performance-critical situations
    static boolean isRomanNumeral(String s){
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    //Better way
    private static final Pattern ROMAN = Pattern.compile(
        "^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean betterIsRomanNumeral(String s){
        return ROMAN.matcher(s).matches();
    }

}
