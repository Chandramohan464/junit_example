package com.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
        
    List<String> student=new ArrayList<>();

    public void add(String name){
        student.add(name);
    }

    public void remove(String name){
        student.remove(name);
    }

    public void removeAll(){
        student.clear();
    }

    public int sizeOfStudent(){
        return student.size();
    }
}
