package com.ylkget.common.exception.user;

/**
 * <p>
 * CaptchaException
 * </p>
 *
 * @author joe 2021/5/31 11:45
 */
public class CaptchaException extends UserException {
    private static final long serialVersionUID = 1L;

    public CaptchaException()
    {
        super("user.jcaptcha.error", null);
    }
}
