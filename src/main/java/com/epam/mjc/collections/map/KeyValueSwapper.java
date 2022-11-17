package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for(Map.Entry<Integer, String> m : sourceMap.entrySet())
        {
            if(map.containsKey(m.getValue()) && m.getKey() < map.get(m.getValue()))
                map.put(m.getValue(),m.getKey());
            else
                map.put(m.getValue(),m.getKey());
        }
        return map;
    }
}
