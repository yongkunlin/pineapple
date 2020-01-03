

package com.pineapple.system.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pineapple.system.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author lyk
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {
	
}
