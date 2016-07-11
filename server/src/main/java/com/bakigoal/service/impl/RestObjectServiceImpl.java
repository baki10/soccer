package com.bakigoal.service.impl;

import com.bakigoal.dao.SimpleDao;
import com.bakigoal.dao.base.IdentifiedEntity;
import com.bakigoal.service.RestObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ilmir on 07.07.16.
 */
@Transactional
public class RestObjectServiceImpl<E extends IdentifiedEntity> implements RestObjectService<E> {

  protected Class<E> entityClass;

  public RestObjectServiceImpl(Class<E> entityClass) {
    this.entityClass = entityClass;
  }


  protected SimpleDao simpleDao;

  @Autowired
  public void setSimpleDao(SimpleDao simpleDao) {
    this.simpleDao = simpleDao;
    simpleDao.setEntityClass(entityClass);
  }

  @Override
  public List<E> getAll() {
    return simpleDao.getAll();
  }

  @Override
  public E getById(Long id) {
    return id == null ? null : (E) simpleDao.findById(id);
  }

  @Override
  public E add(E e) {
    if(e == null){
      return null;
    }
    Serializable id = simpleDao.save(e);
    return id == null ? null : (E) simpleDao.findById(id);
  }

  @Override
  public void update(E e) {
    if(e == null){
      return;
    }
    simpleDao.update(e);
  }

  @Override
  public void delete(Long id) {
    if(id == null){
      return;
    }
    if(getById(id)==null){
      return;
    }
    simpleDao.remove(id);
  }
}
