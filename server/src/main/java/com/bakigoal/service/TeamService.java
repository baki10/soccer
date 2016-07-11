package com.bakigoal.service;

import com.bakigoal.dao.entity.Country;
import com.bakigoal.dao.entity.Team;

import java.util.List;

/**
 * Created by ilmir on 27.06.16.
 */
public interface TeamService extends RestObjectService<Team> {

  List<Team> getTeamsByCountry(Country country);
}
