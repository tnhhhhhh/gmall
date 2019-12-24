package com.tnh.gmall.user.server.impl;

import com.tnh.gmall.api.domain.UmsMember;
import com.tnh.gmall.api.server.UmsMemberService;
import com.tnh.gmall.user.mapper.UmsMemberMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * @author: TNH
 * @create: 2019/12/23 15:08
 */
@Service(version = "1.0.0")
public class UmsMemberServiceImpl implements UmsMemberService {

    @Resource
    private UmsMemberMapper umsMemberMapper;


    @Override
    public List<UmsMember> selectAllUmsMember() {
        return umsMemberMapper.selectAll();
    }
}