package com.bakigoal.service.impl;

import com.bakigoal.dao.entity.Player;
import com.bakigoal.service.PlayerService;
import org.springframework.stereotype.Service;

/**
 * Created by ilmir on 27.06.16.
 */
@Service
public class PlayerServiceImpl extends RestObjectServiceImpl<Player> implements PlayerService {

  public PlayerServiceImpl() {
    super(Player.class);
  }

}
