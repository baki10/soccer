package com.bakigoal.config.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

/**
 * Created by ilmir on 08.07.16.
 */
public class HibernateAwareObjectMapper extends ObjectMapper {

  public HibernateAwareObjectMapper() {
    Hibernate5Module hibernate5Module = new Hibernate5Module();
    registerModule(hibernate5Module);
  }

}