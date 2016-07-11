package com.bakigoal.service.impl;

import com.bakigoal.dao.TeamDao;
import com.bakigoal.dao.entity.Country;
import com.bakigoal.dao.entity.Team;
import com.bakigoal.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ilmir on 27.06.16.
 */
@Service
public class TeamServiceImpl extends RestObjectServiceImpl<Team> implements TeamService {

  public TeamServiceImpl() {
    super(Team.class);
  }

  @Autowired
  private TeamDao teamDao;

  @Override
  public List<Team> getTeamsByCountry(Country country) {
    return teamDao.getTeamsByCountry(country);
  }

}
