package com.java2nb.novel.home.feign;

import com.java2nb.novel.book.api.BookApi;
import com.java2nb.novel.news.api.NewsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 新闻服务Feign客户端
 * @author Vic
 * @version 1.0
 * @since 2021/6/20
 */
@FeignClient("news-service")
public interface NewsFeignClient extends NewsApi {

}
