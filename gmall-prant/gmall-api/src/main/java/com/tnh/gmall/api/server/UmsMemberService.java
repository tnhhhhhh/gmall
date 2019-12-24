package com.tnh.gmall.api.server;

import com.tnh.gmall.api.domain.UmsMember;

import java.util.List;

/**
 * @author: TNH
 * @create: 2019/12/23 15:08
 */
public interface UmsMemberService{
    List<UmsMember> selectAllUmsMember();
}