package com.bakigoal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  @RequestMapping({"/"})
  public String helloWorld() {
    return "index";
  }

  @RequestMapping(value = "/errorPage", method = RequestMethod.GET)
  public String error() {
    throw new NullPointerException("NPE");
  }
}