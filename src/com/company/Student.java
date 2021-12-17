package com.company;

public class Student {
    public int age;
    public int score;
    public String name;

    public void setAge(int age) {
        this.age = age;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getAge() {
        return age;
    }
    public int getScore() {
        return score;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public Student (String name){
        this.name = name;
    }
    public Student (String name, int age){
        this(name);
        this.age = age;
    }
    public Student(String name, int age, int score){
        this(name,age);
        this.score = score;
    }



}