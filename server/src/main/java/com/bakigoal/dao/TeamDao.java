package com.bakigoal.dao;

import com.bakigoal.dao.base.Dao;
import com.bakigoal.dao.base.EntityClassConsumer;
import com.bakigoal.dao.entity.Country;
import com.bakigoal.dao.entity.Team;

import java.util.List;

public interface TeamDao extends Dao<Team>, EntityClassConsumer {

  List<Team> getTeamsByCountry(Country country);

}
