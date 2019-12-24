package com.tnh.gmall.user.server.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tnh.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.tnh.gmall.user.server.UmsMemberReceiveAddressService;
/**
 * 
 * @author: TNH
 * @create: 2019/12/23 15:08
 */
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService{

    @Resource
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

}
