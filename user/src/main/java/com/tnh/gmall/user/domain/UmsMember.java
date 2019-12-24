package com.tnh.gmall.user.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
 * 
 * @author: TNH
 * @create: 2019/12/23 15:08
 */
@Data
@Table(name = "ums_member")
public class UmsMember implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "member_level_id")
    private Long memberLevelId;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 昵称
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * 手机号码
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 注册时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 头像
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 性别：0->未知；1->男；2->女
     */
    @Column(name = "gender")
    private Integer gender;

    /**
     * 生日
     */
    @Column(name = "birthday")
    private Date birthday;

    /**
     * 所做城市
     */
    @Column(name = "city")
    private String city;

    /**
     * 职业
     */
    @Column(name = "job")
    private String job;

    /**
     * 个性签名
     */
    @Column(name = "personalized_signature")
    private String personalizedSignature;

    /**
     * 用户来源
     */
    @Column(name = "source_type")
    private Integer sourceType;

    /**
     * 积分
     */
    @Column(name = "integration")
    private Integer integration;

    /**
     * 成长值
     */
    @Column(name = "growth")
    private Integer growth;

    /**
     * 剩余抽奖次数
     */
    @Column(name = "luckey_count")
    private Integer luckeyCount;

    /**
     * 历史积分数量
     */
    @Column(name = "history_integration")
    private Integer historyIntegration;

    private static final long serialVersionUID = 1L;
}