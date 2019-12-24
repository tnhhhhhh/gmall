package com.tnh.gmall.user.server;

import com.tnh.gmall.user.domain.UmsMember;

import java.util.List;

/**
 * 
 * @author: TNH
 * @create: 2019/12/23 15:08
 */
public interface UmsMemberService{
    List<UmsMember> selectAllUmsMember();
}
