

package com.pineapple.system.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pineapple.common.utils.PageUtils;
import com.pineapple.system.modules.sys.entity.SysDictEntity;

import java.util.Map;

/**
 * 数据字典
 *
 * @author lyk
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

