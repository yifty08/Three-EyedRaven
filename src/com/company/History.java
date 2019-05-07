package com.company;

import java.util.ArrayList;

public class History {

    private ArrayList<String> history = new ArrayList<>();

    public History(){
    }

    public History(ArrayList<String> history) {
        this.history = history;
    }

    public ArrayList<String> getHistory(){
        return history;
    }

//    public void setHistory(ArrayList<String> history) {
//        this.history = history;
//    }

    public void addHistory(String str){
        this.history.add(str);
    }

    public String printHistory() {
        String s = "";
        for (String h : history) {
            s += "\n" + h;
        }
        return s;
    }
}
