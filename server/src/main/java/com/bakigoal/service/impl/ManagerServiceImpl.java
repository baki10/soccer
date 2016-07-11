package com.bakigoal.service.impl;

import com.bakigoal.dao.entity.Manager;
import com.bakigoal.dao.entity.Team;
import com.bakigoal.service.ManagerService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ilmir on 27.06.16.
 */
@Service
@Transactional
public class ManagerServiceImpl extends RestObjectServiceImpl<Manager> implements ManagerService {

  @Autowired
  private SessionFactory sessionFactory;

  public ManagerServiceImpl() {
    super(Manager.class);
  }

  @Override
  public Team getTeamByManager(Manager manager) {
    if(manager == null){
      return null;
    }
    Session session = sessionFactory.getCurrentSession();
    Query query = session.createQuery("select t from Team t inner join t.manager m where m.id = :managerId");
    query.setParameter("managerId", manager.getId());
    List<Team> list = query.list();
    return list != null && !list.isEmpty() ? list.get(0) : null;
  }
}
