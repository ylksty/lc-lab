package com.ylkget.web.controller.system;

import com.ylkget.common.core.domain.AjaxResult;
import com.ylkget.common.core.domain.entity.SysDept;
import com.ylkget.system.service.ISysDeptService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * SysDeptController
 * 部门信息
 * </p>
 *
 * @author joe 2021/6/4 10:13
 */
@RestController
@RequestMapping("system/dept")
public class SysDeptController {
    @Autowired
    private ISysDeptService deptService;

    @ApiOperation("获取部门下拉树列表")
    @GetMapping("/treeselect")
    public AjaxResult treeselect(SysDept dept)
    {
        List<SysDept> depts = deptService.selectDeptList(dept);
        return AjaxResult.success(deptService.buildDeptTreeSelect(depts));
    }
}
