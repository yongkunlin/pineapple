

package com.pineapple.system.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pineapple.common.utils.PageUtils;
import com.pineapple.system.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author lyk
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
