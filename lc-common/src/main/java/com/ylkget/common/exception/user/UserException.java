package com.ylkget.common.exception.user;

import com.ylkget.common.exception.BaseException;

/**
 * <p>
 * UserException
 * </p>
 *
 * @author joe 2021/5/31 11:46
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
