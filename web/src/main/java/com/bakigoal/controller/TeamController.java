package com.bakigoal.controller;

import com.bakigoal.dao.entity.Country;
import com.bakigoal.dao.entity.Team;
import com.bakigoal.service.CountryService;
import com.bakigoal.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TeamController {

  @Autowired
  private CountryService countryService;

  @Autowired
  private TeamService teamService;

  @RequestMapping({"/countries"})
  public String countries() {
    return "countries";
  }

  @GetMapping({"/{country}/teams"})
  public String teams(@PathVariable("country") String countryName, Model model) {
    Country country = countryService.findByName(translateCountryName(countryName));
    if (country == null) {
      throw new RuntimeException("Country - " + countryName + " not found!");
    }
    List<Team> teams = teamService.getTeamsByCountry(country);
    model.addAttribute("country", country);
    System.out.println(teams.size());
    model.addAttribute("teams", teams);
    return "teams";
  }

  @GetMapping({"/teams/{id}"})
  public String team(@PathVariable("id") Long id, Model model) {
    Team team = teamService.getById(id);
    if (team == null) {
      throw new RuntimeException("Team with id " + id + " not found!");
    }
    model.addAttribute("team", team);
    return "team";
  }

  private String translateCountryName(String engName) {
    if (engName == null) {
      return null;
    }
    switch (engName) {
      case "england":
        return "Англия";
      case "france":
        return "Франция";
      case "spain":
        return "Испания";
      case "italy":
        return "Италия";
      case "germany":
        return "Германия";
      case "russia":
        return "Россия";
      default:
        return null;
    }
  }


}