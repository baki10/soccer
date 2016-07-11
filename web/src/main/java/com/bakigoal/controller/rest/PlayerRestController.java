package com.bakigoal.controller.rest;

import com.bakigoal.dao.entity.Player;
import com.bakigoal.service.PlayerService;
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

/**
 * Created by ilmir on 27.06.16.
 */
@RestController
@RequestMapping(value = "/rest/players")
public class PlayerRestController {

  @Autowired
  private PlayerService playerService;

  @GetMapping
  public List<Player> getPlayers() {
    return playerService.getAll();
  }

  @GetMapping(value = "/{id}")
  public Player getPlayer(@PathVariable("id") Long id) {
    return playerService.getById(id);
  }

  @PostMapping
  public Player addPlayer(@RequestBody Player player) {
    return playerService.add(player);
  }

  @PutMapping(value = "/{id}")
  public Player updatePlayer(@RequestBody Player player, @PathVariable("id") Long id) {
    Player playerById = playerService.getById(id);
    if (player == null || playerById == null) {
      return null;
    }
    player.setId(playerById.getId());
    playerService.update(player);
    return playerById;
  }

  @DeleteMapping(value = "/{id}")
  public void deletePlayer(@PathVariable("id") Long id) {
    playerService.delete(id);
  }
}
