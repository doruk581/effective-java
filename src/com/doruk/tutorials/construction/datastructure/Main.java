package com.doruk.tutorials.construction.datastructure;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        final LetterCounter letterCounter = new LetterCounter();

        final Map<Character,Integer> resultMap = letterCounter.countCommonLettersInText("Merhaba Dünya!");

        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
