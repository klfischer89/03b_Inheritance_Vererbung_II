package com.cc.java;

public class Cat extends SuperCat{

  private int counter;

  public Cat(String firstName, String furColor, int age) {
    super(firstName, furColor, age);
  }

  public String getAge() {
      return checkCompliance();
  }

private String checkCompliance(){

       counter++;

        switch (counter) {
            case 1:
                return "This is an inappropriate question!"; // 1st time
            case 2:
                return "I've told you once!"; // 2nd time
            case 3:
                return "Talk to the hand!"; // 3rd time 
            default:
                return "1#!?&&%"; //4th ++
        }

    }

}
  
