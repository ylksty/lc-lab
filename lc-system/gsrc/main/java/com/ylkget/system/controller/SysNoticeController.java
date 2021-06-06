package com.ylkget.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ylkget.common.annotation.Log;
import com.ylkget.common.core.controller.BaseController;
import com.ylkget.common.core.domain.AjaxResult;
import com.ylkget.common.enums.BusinessType;
import com.ylkget.system.domain.SysNotice;
import com.ylkget.system.service.ISysNoticeService;
import com.ylkget.common.utils.poi.ExcelUtil;
import com.ylkget.common.core.page.TableDataInfo;

/**
 * 通知公告Controller
 * 
 * @author yanglk
 * @date 2021-06-06
 */
@RestController
@RequestMapping("/system/notice")
public class SysNoticeController extends BaseController
{
    @Autowired
    private ISysNoticeService sysNoticeService;

    /**
     * 查询通知公告列表
     */
    @PreAuthorize("@ss.hasPermi('system:notice:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysNotice sysNotice)
    {
        startPage();
        List<SysNotice> list = sysNoticeService.selectSysNoticeList(sysNotice);
        return getDataTable(list);
    }

    /**
     * 导出通知公告列表
     */
    @PreAuthorize("@ss.hasPermi('system:notice:export')")
    @Log(title = "通知公告", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysNotice sysNotice)
    {
        List<SysNotice> list = sysNoticeService.selectSysNoticeList(sysNotice);
        ExcelUtil<SysNotice> util = new ExcelUtil<SysNotice>(SysNotice.class);
        return util.exportExcel(list, "notice");
    }

    /**
     * 获取通知公告详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:notice:query')")
    @GetMapping(value = "/{noticeId}")
    public AjaxResult getInfo(@PathVariable("noticeId") Integer noticeId)
    {
        return AjaxResult.success(sysNoticeService.selectSysNoticeById(noticeId));
    }

    /**
     * 新增通知公告
     */
    @PreAuthorize("@ss.hasPermi('system:notice:add')")
    @Log(title = "通知公告", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysNotice sysNotice)
    {
        return toAjax(sysNoticeService.insertSysNotice(sysNotice));
    }

    /**
     * 修改通知公告
     */
    @PreAuthorize("@ss.hasPermi('system:notice:edit')")
    @Log(title = "通知公告", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysNotice sysNotice)
    {
        return toAjax(sysNoticeService.updateSysNotice(sysNotice));
    }

    /**
     * 删除通知公告
     */
    @PreAuthorize("@ss.hasPermi('system:notice:remove')")
    @Log(title = "通知公告", businessType = BusinessType.DELETE)
	@DeleteMapping("/{noticeIds}")
    public AjaxResult remove(@PathVariable Integer[] noticeIds)
    {
        return toAjax(sysNoticeService.deleteSysNoticeByIds(noticeIds));
    }
}
