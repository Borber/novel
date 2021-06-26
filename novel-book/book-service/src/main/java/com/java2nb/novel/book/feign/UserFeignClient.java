package com.java2nb.novel.book.feign;

import com.java2nb.novel.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户服务Feign客户端
 * @author Loving
 * @version 1.0
 * @since 2021/6/07
 */
@FeignClient("user-service")
public interface UserFeignClient extends UserApi {

}
