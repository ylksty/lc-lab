package com.ylkget.system.service;

import java.util.List;
import com.ylkget.system.domain.SysNotice;

/**
 * 通知公告Service接口
 * 
 * @author yanglk
 * @date 2021-06-06
 */
public interface ISysNoticeService 
{
    /**
     * 查询通知公告
     * 
     * @param noticeId 通知公告ID
     * @return 通知公告
     */
    public SysNotice selectSysNoticeById(Integer noticeId);

    /**
     * 查询通知公告列表
     * 
     * @param sysNotice 通知公告
     * @return 通知公告集合
     */
    public List<SysNotice> selectSysNoticeList(SysNotice sysNotice);

    /**
     * 新增通知公告
     * 
     * @param sysNotice 通知公告
     * @return 结果
     */
    public int insertSysNotice(SysNotice sysNotice);

    /**
     * 修改通知公告
     * 
     * @param sysNotice 通知公告
     * @return 结果
     */
    public int updateSysNotice(SysNotice sysNotice);

    /**
     * 批量删除通知公告
     * 
     * @param noticeIds 需要删除的通知公告ID
     * @return 结果
     */
    public int deleteSysNoticeByIds(Integer[] noticeIds);

    /**
     * 删除通知公告信息
     * 
     * @param noticeId 通知公告ID
     * @return 结果
     */
    public int deleteSysNoticeById(Integer noticeId);
}
