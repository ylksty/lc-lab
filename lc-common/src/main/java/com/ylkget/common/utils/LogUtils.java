package com.ylkget.common.utils;

/**
 * <p>
 * LogUtils
 * </p>
 *
 * @author joe 2021/5/31 11:23
 */
public class LogUtils {
    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
