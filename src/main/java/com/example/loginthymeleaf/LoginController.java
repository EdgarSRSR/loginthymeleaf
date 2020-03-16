package com.example.loginthymeleaf;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
  //to get login form page
  @RequestMapping(value="/login", method= RequestMethod.GET)
  public String getLoginForm(){
    // return html page name
    return "login";
  }

  //checking for login credentials
  @RequestMapping(value="/login", method=RequestMethod.POST)
  public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model){

    String username = LoginForm.getUsername();
    String email = loginForm.getEmail();

    if("admin".equals(username) && "admin".equals(email)){
      // if the username and email is correct it send it to user page
      return "user";
    }
    // if the username and email is wrong
    model.addAttribute("invalidCredentials", true);
    //returning again login page
    return "login";
  }

}
