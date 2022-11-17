package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> m = new HashMap<>();
        sentence = sentence.toLowerCase();
        String[] words = sentence.split("\\W+");
        for (String word : words)
        {
            if(m.containsKey(word))
                m.replace(word,m.get(word) + 1);
            else
                m.put(word, 1);
        }
        return m;
    }
}
