package com.ylkget.generator.service;

import com.ylkget.generator.domain.GenTable;
import com.ylkget.generator.mapper.GenTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *     GenTableServiceImpl
 *     业务 服务层实现
 * </p>
 *
 * @author joe 2021/6/3 18:53
 */
@Service
public class GenTableServiceImpl implements IGenTableService {
    @Autowired
    private GenTableMapper genTableMapper;

    @Override
    public List<GenTable> selectGenTableList(GenTable genTable) {
        return genTableMapper.selectGenTableList(genTable);
    }
}
