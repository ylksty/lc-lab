package com.ylkget.generator.controller;

import com.ylkget.common.core.controller.BaseController;
import com.ylkget.generator.domain.GenTable;
import com.ylkget.common.core.page.TableDataInfo;
import com.ylkget.generator.service.IGenTableService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * <p>
 * GenController
 * 代码生成 操作处理
 * </p>
 *
 * @author joe 2021/6/3 18:39
 */
@RestController
@RequestMapping("/tool/gen")
public class GenController extends BaseController {
    @Autowired
    private IGenTableService genTableService;

    /**
     * 查询代码生成列表
     */
    @ApiOperation(value = "查询代码生成列表ssbs")
    @PreAuthorize("@ss.hasPermi('tool:gen:list')")
    @GetMapping("/list")
    public TableDataInfo genList(GenTable genTable)
    {
        startPage();
        List<GenTable> list = genTableService.selectGenTableList(genTable);
        return getDataTable(list);
    }
}
