package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckOccurrence {
    public Map<String, Boolean> checkOccurrenceOfWords(String[] input){
        if(input.length==0){
            return null;
        }
        else {
            Map<String, Integer> mp = new HashMap<String, Integer>();

            for (String str : input) {
                Integer n = mp.get(str);
                n = (n == null) ? 1 : ++n;
                mp.put(str, n);
            }
            Map<String, Boolean> result = new HashMap<String, Boolean>();
            for (Map.Entry<String, Integer> entry : mp.entrySet()) {
                if (entry.getValue() >= 2) {
                    result.put(entry.getKey(), true);
                } else
                    result.put(entry.getKey(), false);
            }
            return result;
        }
    }
}
