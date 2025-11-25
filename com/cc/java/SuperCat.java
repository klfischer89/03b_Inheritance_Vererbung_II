package com.cc.java;

public class SuperCat {
    
  private String firstName;
  private String furColor;
  protected int age;

  public SuperCat(String firstName, String furColor, int age) {
    this.firstName = firstName;
    this.furColor = furColor;
    this.age = age;
  } 
  
  protected String getStringAttributes(String op) {
    switch (op) {
      case "#name":
        return firstName;
      case "#color":
        return furColor;
      default:
        return "ERROR!";
    }
  }

}
