package com.java2nb.novel.common.bean;


import com.java2nb.novel.common.enums.ResponseStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 自定义Api响应结构
 *
 * @param <T> 响应数据类型
 * @author Loving
 * @version 1.0
 * @since 2021/6/04
 */
@Data
public class ResultBean<T> {

    @ApiModelProperty(value = "响应状态码，200表示成功")
    private int code = ResponseStatus.OK.getCode();

    /**
     * 响应消息
     */
    @ApiModelProperty(value = "响应状态信息")
    private String msg = ResponseStatus.OK.getMsg();
    /**
     * 响应中的数据
     */
    @ApiModelProperty(value = "响应数据")
    private T data;

    private ResultBean() {

    }

    private ResultBean(ResponseStatus responseStatus) {
        this.code = responseStatus.getCode();
        this.msg = responseStatus.getMsg();
    }

    private ResultBean(T data) {
        this.data = data;
    }


    /**
     * 业务处理成功,无数据返回
     */
    public static ResultBean<Void> ok() {
        return new ResultBean<>();
    }

    /**
     * 业务处理成功，有数据返回
     */
    public static <T> ResultBean<T> ok(T data) {
        return new ResultBean<>(data);
    }

    /**
     * 业务处理失败
     */
    public static ResultBean<Void> fail(ResponseStatus responseStatus) {
        return new ResultBean<>(responseStatus);
    }


    /**
     * 系统错误
     */
    public static ResultBean<Void> error() {
        return new ResultBean<>(ResponseStatus.ERROR);
    }
}

