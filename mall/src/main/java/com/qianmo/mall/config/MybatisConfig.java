/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: MybatisConfig
 * Author:   qianmo
 * Date:     2021/1/24 15:28
 * Description: MyBatis配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.qianmo.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈MyBatis配置类〉
 *
 * @author qianmo
 * @create 2021/1/24
 * @since 1.0.0
 */
@Configuration
@MapperScan("com.qianmo.mall.mbg.mapper")
public class MybatisConfig {
}
