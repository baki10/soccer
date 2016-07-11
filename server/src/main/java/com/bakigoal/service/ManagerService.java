package com.bakigoal.service;

import com.bakigoal.dao.entity.Manager;
import com.bakigoal.dao.entity.Team;

/**
 * Created by ilmir on 27.06.16.
 */
public interface ManagerService extends RestObjectService<Manager> {
  Team getTeamByManager(Manager manager);
}
