package com.kv.javaCourse.dataStructures.Interface;

import java.util.List;

public interface ISaveable {

//    methods declared in interface are by default, "public"
    List<String> write();
    void read(List<String> readMe);
}
