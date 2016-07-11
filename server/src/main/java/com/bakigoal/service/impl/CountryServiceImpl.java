package com.bakigoal.service.impl;

import com.bakigoal.dao.entity.Country;
import com.bakigoal.service.CountryService;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ilmir on 27.06.16.
 */
@Service
public class CountryServiceImpl extends RestObjectServiceImpl<Country> implements CountryService {

  public CountryServiceImpl() {
    super(Country.class);
  }

  @Override
  public Country findByName(String countryName) {
    if (countryName == null) {
      return null;
    }
    Criteria criteria = simpleDao.createBaseCriteria();
    criteria.add(Restrictions.eq("name", countryName));
    List<Country> list = criteria.list();
    return list == null || list.isEmpty() ? null : list.get(0);
  }
}
