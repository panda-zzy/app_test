package com.ht17.app_test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ht17.app_test.dao.BaseDao;
import com.ht17.app_test.pojo.entity.BaseEntity;
import com.ht17.app_test.service.BaseService;


/**
 * @author Panda
 * @create 2022-11-18:04
 */
public class BaseServiceImpl<M extends BaseDao<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements BaseService<T> {

}