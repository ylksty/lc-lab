package com.ylkget.generator.service;

import com.ylkget.generator.domain.GenTable;

import java.util.List;

/**
 * <p>
 *     IGenTableService
 *     业务 服务层
 * </p>
 *
 * @author joe 2021/6/3 18:50
 */
public interface IGenTableService {

    /**
     * 查询业务列表
     *
     * @param genTable 业务信息
     * @return 业务集合
     */
    List<GenTable> selectGenTableList(GenTable genTable);
}
