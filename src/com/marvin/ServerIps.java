package com.itlaoge;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//服务器IP
public class ServerIps {
    public static final List<String> LIST = Arrays.asList(
            "A",
            "B",
            "C"
    );
    //带权重
    public static final Map<String,Integer> WEIGHT_LIST = new LinkedHashMap<String, Integer>();
    static {
        WEIGHT_LIST.put("A",2);
        WEIGHT_LIST.put("B",3);
        WEIGHT_LIST.put("C",5);
    }
}
