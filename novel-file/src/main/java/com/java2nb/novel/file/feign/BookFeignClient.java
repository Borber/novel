package com.java2nb.novel.file.feign;


import com.java2nb.novel.book.api.BookApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 小说服务Feign客户端
 * @author Borber
 * @version 1.0
 * @since 2021/6/2
 */
@FeignClient(value = "book-service")
public interface BookFeignClient extends BookApi {


}
