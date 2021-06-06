package com.ylkget.web.controller.system;

import com.ylkget.common.core.controller.BaseController;
import com.ylkget.common.core.domain.AjaxResult;
import com.ylkget.common.core.domain.entity.SysMenu;
import com.ylkget.common.core.domain.model.LoginUser;
import com.ylkget.common.utils.ServletUtils;
import com.ylkget.framework.web.service.TokenService;
import com.ylkget.system.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * SysMenuController
 * </p>
 *
 * @author joe 2021/6/5 10:38
 */
@RestController
@RequestMapping("/system/menu")
public class SysMenuController extends BaseController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private ISysMenuService menuService;

    /**
     * 获取菜单下拉树列表
     */
    @GetMapping("/treeselect")
    public AjaxResult treeselect(SysMenu menu)
    {
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        List<SysMenu> menus = menuService.selectMenuList(menu, userId);
        return AjaxResult.success(menuService.buildMenuTreeSelect(menus));
    }
}
