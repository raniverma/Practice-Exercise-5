package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class ChangeKeyValue {

    public Map<String,String> changeKeyValueInMap(Map<String,String> mp){
        if(mp.size()==0)
            return null;
        else if(mp.size()==1)
            return mp;
        else{
            for (Map.Entry<String, String> entry : mp.entrySet()) {
                if (entry.getKey().equals("val1") && entry.getValue() != null) {
                    String value = entry.getValue();
                    mp.put("val1", " ");
                    mp.put("val2", value);
                } else {
                    continue;
                }
            }
            return mp;
        }
    }
}
