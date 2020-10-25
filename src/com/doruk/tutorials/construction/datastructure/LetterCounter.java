package com.doruk.tutorials.construction.datastructure;

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {

    public Map<Character,Integer> countCommonLettersInText(final String text){

        final String sentence = text.replaceAll("\\s+","");

        final Map<Character,Integer> countMap = new HashMap<>();

        for (int position = 0; position < sentence.length(); position++){

            final Character character = sentence.charAt(position);

            if (countMap.containsKey(character)){
                Integer count = countMap.get(character);
                count ++;
                countMap.put(character,count);
            }else {
                countMap.put(character,1);
            }
        }

        return countMap;
    }

}
