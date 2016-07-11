package com.bakigoal.service.impl;

import com.bakigoal.dao.entity.Stadium;
import com.bakigoal.service.StadiumService;
import org.springframework.stereotype.Service;

/**
 * Created by ilmir on 27.06.16.
 */
@Service
public class StadiumServiceImpl extends RestObjectServiceImpl<Stadium> implements StadiumService {

  public StadiumServiceImpl() {
    super(Stadium.class);
  }

}
