/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: IErrorCode
 * Author:   qianmo
 * Date:     2021/1/24 15:38
 * Description: API的错误码
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.qianmo.mall.common.api;

/**
 * 〈一句话功能简述〉<br> 
 * 〈API的错误码〉
 *
 * @author qianmo
 * @create 2021/1/24
 * @since 1.0.0
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
