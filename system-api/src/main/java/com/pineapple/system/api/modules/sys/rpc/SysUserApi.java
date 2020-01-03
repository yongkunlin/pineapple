package com.pineapple.system.api.modules.sys.rpc;

import com.pineapple.common.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 用户提供外部访问
 *
 * @author lyk
 */
@FeignClient(value = "system")
public interface SysUserApi {
    /**
     * 测试是否畅通
     *
     * @return 测试结果
     */
    @GetMapping("/sys/user/info")
    Result info();
}
