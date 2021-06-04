package com.java2nb.novel.common.bean;

import lombok.Data;

/**
 * 登陆用户信息封装
 * @author Loving
 * @version 1.0
 * @since 2021/6/04
 */
@Data
public class UserDetails {

    private Long id;

    private String username;

    private String nickName;
}
