/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: ResultCode
 * Author:   qianmo
 * Date:     2021/1/24 15:37
 * Description: 枚举了一些常用API操作码
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.qianmo.mall.common.api;

/**
 * 〈一句话功能简述〉<br> 
 * 〈枚举了一些常用API操作码〉
 *
 * @author qianmo
 * @create 2021/1/24
 * @since 1.0.0
 */
public enum ResultCode implements IErrorCode{
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
