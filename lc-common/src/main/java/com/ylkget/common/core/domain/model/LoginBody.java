package com.ylkget.common.core.domain.model;

import lombok.Data;

/**
 * <p>
 * LoginBody
 * </p>
 *
 * @author joe 2021/5/25 14:55
 */
@Data
public class LoginBody {
    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 验证码
     */
    private String code;

    /**
     * 唯一标识
     */
    private String uuid = "";
}
