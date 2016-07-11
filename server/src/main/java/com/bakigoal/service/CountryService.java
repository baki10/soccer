package com.bakigoal.service;

import com.bakigoal.dao.entity.Country;

/**
 * Created by ilmir on 27.06.16.
 */
public interface CountryService extends RestObjectService<Country> {
  Country findByName(String countryName);
}
