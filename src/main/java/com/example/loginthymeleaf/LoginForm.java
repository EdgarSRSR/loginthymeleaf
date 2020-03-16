package com.example.loginthymeleaf;

public class LoginForm {

  private static String username;
  private String email;
  public LoginForm(){
    super();
  }

  public static String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
