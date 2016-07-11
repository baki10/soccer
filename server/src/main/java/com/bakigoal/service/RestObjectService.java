package com.bakigoal.service;

import java.util.List;

/**
 * Created by ilmir on 27.06.16.
 */
public interface RestObjectService<E> {
  List<E> getAll();

  E getById(Long id);

  E add(E e);

  void update(E e);

  void delete(Long id);
}
