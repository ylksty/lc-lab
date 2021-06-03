package com.ylkget.common.exception.user;

/**
 * <p>
 * UserPasswordNotMatchException
 * </p>
 *
 * @author joe 2021/5/31 11:58
 */
public class UserPasswordNotMatchException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}
