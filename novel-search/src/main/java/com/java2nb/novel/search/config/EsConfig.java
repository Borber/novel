package com.java2nb.novel.search.config;


import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * elasticsearch搜索引擎配置
 * @author Pete
 * @since 2021/6/18
 */
@Configuration
public class EsConfig {

    @Value("${spring.elasticsearch.jest.uris}")
    private String esUris;

    @Bean(destroyMethod = "close")
    public RestHighLevelClient esClient(){


        String[] uris = esUris.split(",");
        HttpHost[] hosts = new HttpHost[uris.length];
        for(int i = 0 ; i < uris.length ; i++){
            String uri = uris[i];
            String scheme = uri.substring(0,uri.indexOf(":")).trim();
            String hostname = uri.substring(uri.indexOf("://")+3,uri.lastIndexOf(":")).trim();
            Integer port = Integer.parseInt(uri.substring(uri.lastIndexOf(":")+1).trim());
            hosts[i] = new HttpHost(hostname,port,scheme);
        }

        return new RestHighLevelClient(
                RestClient.builder(hosts));

    }
}
