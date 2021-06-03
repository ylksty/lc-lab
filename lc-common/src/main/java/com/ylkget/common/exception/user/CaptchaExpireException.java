package com.ylkget.common.exception.user;

/**
 * <p>
 * CaptchaExpireException
 * </p>
 *
 * @author joe 2021/5/31 11:49
 */
public class CaptchaExpireException extends UserException {
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire", null);
    }
}
