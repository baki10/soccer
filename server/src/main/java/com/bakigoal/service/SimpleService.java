package com.bakigoal.service;

import com.bakigoal.dao.base.EntityClassConsumer;

/**
 * Created by ilmir on 27.06.16.
 */
public interface SimpleService<E> extends RestObjectService<E>, EntityClassConsumer {
}
