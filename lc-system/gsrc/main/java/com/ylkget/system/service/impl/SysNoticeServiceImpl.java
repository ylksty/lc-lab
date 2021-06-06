package com.ylkget.system.service.impl;

import java.util.List;
import com.ylkget.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ylkget.system.mapper.SysNoticeMapper;
import com.ylkget.system.domain.SysNotice;
import com.ylkget.system.service.ISysNoticeService;

/**
 * 通知公告Service业务层处理
 * 
 * @author yanglk
 * @date 2021-06-06
 */
@Service
public class SysNoticeServiceImpl implements ISysNoticeService 
{
    @Autowired
    private SysNoticeMapper sysNoticeMapper;

    /**
     * 查询通知公告
     * 
     * @param noticeId 通知公告ID
     * @return 通知公告
     */
    @Override
    public SysNotice selectSysNoticeById(Integer noticeId)
    {
        return sysNoticeMapper.selectSysNoticeById(noticeId);
    }

    /**
     * 查询通知公告列表
     * 
     * @param sysNotice 通知公告
     * @return 通知公告
     */
    @Override
    public List<SysNotice> selectSysNoticeList(SysNotice sysNotice)
    {
        return sysNoticeMapper.selectSysNoticeList(sysNotice);
    }

    /**
     * 新增通知公告
     * 
     * @param sysNotice 通知公告
     * @return 结果
     */
    @Override
    public int insertSysNotice(SysNotice sysNotice)
    {
        sysNotice.setCreateTime(DateUtils.getNowDate());
        return sysNoticeMapper.insertSysNotice(sysNotice);
    }

    /**
     * 修改通知公告
     * 
     * @param sysNotice 通知公告
     * @return 结果
     */
    @Override
    public int updateSysNotice(SysNotice sysNotice)
    {
        sysNotice.setUpdateTime(DateUtils.getNowDate());
        return sysNoticeMapper.updateSysNotice(sysNotice);
    }

    /**
     * 批量删除通知公告
     * 
     * @param noticeIds 需要删除的通知公告ID
     * @return 结果
     */
    @Override
    public int deleteSysNoticeByIds(Integer[] noticeIds)
    {
        return sysNoticeMapper.deleteSysNoticeByIds(noticeIds);
    }

    /**
     * 删除通知公告信息
     * 
     * @param noticeId 通知公告ID
     * @return 结果
     */
    @Override
    public int deleteSysNoticeById(Integer noticeId)
    {
        return sysNoticeMapper.deleteSysNoticeById(noticeId);
    }
}
