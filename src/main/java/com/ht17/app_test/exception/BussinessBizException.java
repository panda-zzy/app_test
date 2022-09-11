package com.ht17.app_test.exception;
import com.ht17.app_test.result.ResultCode;

/**
 * Business logic exception.
 * @author zzn
 * @since 2021/8/19 11:19 AM
 */
public class BussinessBizException extends RuntimeException {
    private final int code;
    private final String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    public BussinessBizException(String message) {
        super(message);
        code = ResultCode.FAILED.getCode();
        msg = message;
    }
    public BussinessBizException(int code, String message) {
        super(message);
        this.code=code;
        this.msg=message;
    }

    protected BussinessBizException(String message, Throwable t) {
        super(message);
        code = ResultCode.FAILED.getCode();
        msg = message;
    }
}
