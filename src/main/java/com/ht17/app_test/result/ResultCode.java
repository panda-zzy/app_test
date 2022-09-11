package com.ht17.app_test.result;

/**
 * 枚举了一些常用API的操作码
 *
 * @author goufn
 * @version V1.0
 * @date 2020-07-09 14:14
 */
public enum ResultCode implements IErrorCode {
    /**
     * 操作成功
     */
    SUCCESS(200, "操作成功"),
    SIGN_VALID_ERROR(201, "签名检验失败"),
    FAILED(500, "系统异常!"),
    VALIDATE_FAILED(400, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");


    private int code;
    private String message;

    private ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
