package com.bakigoal.controller;

import com.bakigoal.dao.entity.Player;
import com.bakigoal.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ilmir on 10.07.16.
 */
@Controller
@RequestMapping("/player")
public class PlayerController {

  @Autowired
  private PlayerService playerService;

  @RequestMapping("/{id}")
  public String getPlayer(@PathVariable("id") Long id, Model model) {
    Player player = playerService.getById(id);
    if (player == null) {
      throw new RuntimeException("Player with id = " + id + " not found!");
    }
    model.addAttribute("player", player);
    return "player";
  }
}
