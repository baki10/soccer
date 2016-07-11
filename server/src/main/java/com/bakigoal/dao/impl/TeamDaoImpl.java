package com.bakigoal.dao.impl;

import com.bakigoal.dao.TeamDao;
import com.bakigoal.dao.base.BaseDao;
import com.bakigoal.dao.entity.Country;
import com.bakigoal.dao.entity.Team;
import org.hibernate.query.Query;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("teamDao")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TeamDaoImpl extends BaseDao<Team> implements TeamDao {

  public TeamDaoImpl() {
    super(Team.class);
  }


  @Override
  public List<Team> getTeamsByCountry(Country country) {
    Query query = getSession().createQuery("select t from CompetingTeam ct" +
        " inner join ct.team t " +
        " inner join ct.competition c " +
        " inner join c.country ctry where ctry.id = :countryId order by t.name")
        .setParameter("countryId", country.getId());

    return query.list();
  }
}
