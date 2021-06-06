package com.ylkget.generator.service;

import com.ylkget.generator.domain.GenTable;

import java.util.List;
import java.util.Map;

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

    void synchDb(String tableName);

    List<GenTable> selectDbTableList(GenTable genTable);

    void validateEdit(GenTable genTable);

    void updateGenTable(GenTable genTable);

    void deleteGenTableByIds(Long[] tableIds);

    GenTable selectGenTableById(Long talbleId);

    /**
     * 查询所有表信息
     *
     * @return 表信息集合
     */
    List<GenTable> selectGenTableAll();

    /**
     * 查询据库列表
     *
     * @param tableNames 表名称组
     * @return 数据库表集合
     */
    List<GenTable> selectDbTableListByNames(String[] tableNames);

    /**
     * 导入表结构
     *
     * @param tableList 导入表列表
     */
    void importGenTable(List<GenTable> tableList);

    /**
     * 预览代码
     *
     * @param tableId 表编号
     * @return 预览数据列表
     */
    Map<String, String> previewCode(Long tableId);

    /**
     * 生成代码（自定义路径）
     *
     * @param tableName 表名称
     * @return 数据
     */
    void generatorCode(String tableName);
}
