package com.java2nb.novel.home.feign;

import com.java2nb.novel.book.api.BookApi;
import com.java2nb.novel.home.feign.fallback.BookFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 小说服务Feign客户端
 * @author Vic
 * @version 1.0
 * @since 2021/6/20
 */

@FeignClient(name = "book-service",fallback = BookFeignFallback.class)
public interface BookFeignClient extends BookApi {


}
