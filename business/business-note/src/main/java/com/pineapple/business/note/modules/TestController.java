package com.pineapple.business.note.modules;

import com.pineapple.common.utils.Result;
import com.pineapple.system.api.modules.sys.rpc.SysUserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private SysUserApi sysUserApi;

    @RequestMapping("test")
    public Result test() {
        return sysUserApi.info();
    }
}
