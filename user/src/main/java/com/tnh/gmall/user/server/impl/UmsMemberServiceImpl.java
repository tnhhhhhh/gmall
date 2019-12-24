package com.tnh.gmall.user.server.impl;

import com.tnh.gmall.user.domain.UmsMember;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tnh.gmall.user.mapper.UmsMemberMapper;
import com.tnh.gmall.user.server.UmsMemberService;

import java.util.List;

/**
 * 
 * @author: TNH
 * @create: 2019/12/23 15:08
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService{

    @Resource
    private UmsMemberMapper umsMemberMapper;


    @Override
    public List<UmsMember> selectAllUmsMember() {
        return umsMemberMapper.selectAll();
    }
}
