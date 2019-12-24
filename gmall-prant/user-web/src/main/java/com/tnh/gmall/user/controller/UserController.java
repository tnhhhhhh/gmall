package com.tnh.gmall.user.controller;

import com.tnh.gmall.api.domain.UmsMember;
import com.tnh.gmall.api.server.UmsMemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: TNH
 * @create: 2019/12/23 19:16
 */
@Controller
public class UserController {

    @Reference(version = "1.0.0")
    private UmsMemberService umsMemberService;

    @RequestMapping("/userAllList")
    @ResponseBody
    public List<UmsMember> userAllList(){
        return umsMemberService.selectAllUmsMember();
    }
}
