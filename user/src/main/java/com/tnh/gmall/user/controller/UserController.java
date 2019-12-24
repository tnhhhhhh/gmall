package com.tnh.gmall.user.controller;

import com.tnh.gmall.user.domain.UmsMember;
import com.tnh.gmall.user.server.UmsMemberReceiveAddressService;
import com.tnh.gmall.user.server.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: TNH
 * @create: 2019/12/23 15:09
 */
@Controller
public class UserController {
    @Resource
    private UmsMemberService umsMemberService;
    @Resource
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @RequestMapping("/umsMemberAllList")
    @ResponseBody
    public List<UmsMember> umsMemberAllList(){
        return umsMemberService.selectAllUmsMember();
    }
}
