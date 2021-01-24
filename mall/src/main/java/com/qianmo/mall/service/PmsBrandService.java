/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: PmsBrandService
 * Author:   qianmo
 * Date:     2021/1/24 15:32
 * Description: PmsBrandService
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.qianmo.mall.service;

import com.qianmo.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈PmsBrandService〉
 *
 * @author qianmo
 * @create 2021/1/24
 * @since 1.0.0
 */

public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
