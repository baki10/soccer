package com.bakigoal.controller;

import com.bakigoal.dao.entity.Manager;
import com.bakigoal.dao.entity.Team;
import com.bakigoal.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ilmir on 10.07.16.
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

  @Autowired
  private ManagerService managerService;

  @RequestMapping("/{id}")
  public String getManager(@PathVariable("id") Long id, Model model) {
    Manager manager = managerService.getById(id);
    if (manager == null) {
      throw new RuntimeException("Manager with id = " + id + " not found!");
    }
    Team team = managerService.getTeamByManager(manager);
    model.addAttribute("manager", manager);
    model.addAttribute("team", team);
    return "manager";
  }
}
