package com.bakigoal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ilmir on 05.07.16.
 */
public class HibernateMain {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
  }
}
