package com.syntax.class19;

public class SDT extends Human {
    boolean goodWithJava;
   SDT(String name, String eyeColor, String job, int age, boolean goodWithJava){
       // this.name is coming from Parent class Human
       this.name=name;
       this.eyeColor=eyeColor;
       this.job=job;
       this.age=age;
       this.goodWithJava=goodWithJava;
    }
    void printInfo(){
        System.out.println("my name is "+name+" i do "+job+ " am I good with Java "+goodWithJava);
    }

    public static void main(String[] args) {
        SDT sdt=new SDT("Saber ", "Hazel","QA",22, true);
        sdt.printInfo();
    }
    }
