package com.bakigoal.service.impl;

import com.bakigoal.dao.base.IdentifiedEntity;
import com.bakigoal.service.SimpleService;
import org.springframework.stereotype.Service;

/**
 * Created by ilmir on 27.06.16.
 */
@Service
public class SimpleServiceImpl extends RestObjectServiceImpl implements SimpleService {

  public SimpleServiceImpl() {
    super(null);
  }

  @Override
  public void setEntityClass(Class<? extends IdentifiedEntity> entityClass) {
    this.entityClass = entityClass;
    simpleDao.setEntityClass(entityClass);
  }

  @Override
  public Class<? extends IdentifiedEntity> getEntityClass() {
    return entityClass;
  }
}
