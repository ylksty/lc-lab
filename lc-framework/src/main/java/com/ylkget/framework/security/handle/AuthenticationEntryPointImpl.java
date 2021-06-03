package com.ylkget.framework.security.handle;

import com.alibaba.fastjson.JSON;
import com.ylkget.common.constant.HttpStatus;
import com.ylkget.common.core.domain.AjaxResult;
import com.ylkget.common.utils.ServletUtils;
import com.ylkget.common.utils.StringUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * <p>
 * AuthenticationEntryPointImpl
 * 认证失败处理类 返回未授权
 * </p>
 *
 * @author joe 2021/5/31 16:09
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint, Serializable {
    private static final long serialVersionUID = -8970718410437077606L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e)
            throws IOException
    {
        int code = HttpStatus.UNAUTHORIZED;
        String msg = StringUtils.format("请求访问：{}，认证失败，无法访问系统资源", request.getRequestURI());
        ServletUtils.renderString(response, JSON.toJSONString(AjaxResult.error(code, msg)));
    }
}
