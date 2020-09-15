package io.alderson.lego.core.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public final class Response<T> {

    @ApiModelProperty(name = "code", value = "响应状态码")
    private Integer code;

    @ApiModelProperty(name = "msg", value = "提示消息")
    private String msg;

    @ApiModelProperty(name = "data", value = "响应数据")
    private T data;

    public Response(Integer code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static <T> Response<T> ok(T data){
        Response<T> response = new Response<T>(200, "success", data);
        return response;
    }

    public static <T> Response<T> fail(String msg){
        Response<T> response = new Response<>(400, msg, null);
        return response;
    }

}
