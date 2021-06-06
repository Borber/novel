package com.java2nb.novel.file.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * OSS配置
 *
 * @author Borber
 * @version 1.0
 * @since 2021/6/6
 */
@Data
@Component
@ConfigurationProperties(prefix="novel.file")
public class OssProperties {

    private String endpoint;

    private String keyId;

    private String keySecret;

    private String fileHost;

    private String bucketName;

    private String webUrl;


}
