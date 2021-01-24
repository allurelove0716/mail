/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: PmsBrandServiceImpl
 * Author:   qianmo
 * Date:     2021/1/24 16:07
 * Description: PmsBrandService实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.qianmo.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.qianmo.mall.mbg.mapper.PmsBrandMapper;
import com.qianmo.mall.mbg.model.PmsBrand;
import com.qianmo.mall.mbg.model.PmsBrandExample;
import com.qianmo.mall.service.PmsBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈PmsBrandService实现类〉
 *
 * @author qianmo
 * @create 2021/1/24
 * @since 1.0.0
 */
@Service("pmsBrandService")
public class PmsBrandServiceImpl implements PmsBrandService {
    @Resource
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return pmsBrandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return pmsBrandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
