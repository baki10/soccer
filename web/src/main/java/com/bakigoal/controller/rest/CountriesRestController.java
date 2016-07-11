package com.bakigoal.controller.rest;

import com.bakigoal.dao.entity.Country;
import com.bakigoal.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/countries")
public class CountriesRestController {

  @Autowired
  private CountryService service;

  @GetMapping
  public List<Country> getAll() {
    return service.getAll();
  }

  @GetMapping(value = "/{id}")
  public Country getById(@PathVariable("id") Long id) {
    return service.getById(id);
  }

  @PostMapping
  public Country add(@RequestBody Country country) {
    return service.add(country);
  }

  @PutMapping(value = "/{id}")
  public Country update(@RequestBody Country country, @PathVariable("id") Long id) {
    Country byId = service.getById(id);
    if (country == null || byId == null) {
      return null;
    }
    country.setId(byId.getId());
    service.update(country);
    return country;
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable("id") Long id) {
    service.delete(id);
  }

}
