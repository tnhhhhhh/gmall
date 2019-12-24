package com.tnh.gmall.user.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * 
 * @author: TNH
 * @create: 2019/12/23 15:08
 */
@Data
@Table(name = "ums_member_receive_address")
public class UmsMemberReceiveAddress implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    /**
     * 收货人名称
     */
    @Column(name = "`name`")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 是否为默认
     */
    @Column(name = "default_status")
    private Integer defaultStatus;

    /**
     * 邮政编码
     */
    @Column(name = "post_code")
    private String postCode;

    /**
     * 省份/直辖市
     */
    @Column(name = "province")
    private String province;

    /**
     * 城市
     */
    @Column(name = "city")
    private String city;

    /**
     * 区
     */
    @Column(name = "region")
    private String region;

    /**
     * 详细地址(街道)
     */
    @Column(name = "detail_address")
    private String detailAddress;

    private static final long serialVersionUID = 1L;
}