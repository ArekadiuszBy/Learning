package com.company;

public class Person {
    private String name;
    private String sur;
    private int liczba;

    public Person(String name, String sur, int liczba) {
        this.name = name;
        this.sur = sur;
        this.liczba=liczba;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
       this.name=name;
    }

    public String getSur(){
        return sur;
    }

    public void setLiczba(int liczba){
        this.liczba=liczba;
    }

    public int getLiczba() {
        return liczba;
    }


}
