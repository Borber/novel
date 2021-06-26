package com.java2nb.novel.home.feign.fallback;

import com.java2nb.novel.book.api.fallback.BookApiFallback;
import com.java2nb.novel.home.feign.BookFeignClient;
import org.springframework.stereotype.Service;

/**
 * 小说Feign客户端降级处理类(服务消费端，自定义降级处理)
 * @author Vic
 * @version 1.0
 * @since 2021/6/7
 */
@Service
public class BookFeignFallback extends BookApiFallback implements BookFeignClient {
}
