package com.fwtai.tool;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 过滤器
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-08 15:56
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Component
public class LoginFilter implements GlobalFilter, Ordered{

    // 因为可以定义多个过滤器，所以返回的数字越小就越先执行
    @Override
    public int getOrder(){
        return 0;
    }

    //只传一个参数时调用两次???,多个参数就仅调用一次???
    @Override
    public Mono<Void> filter(final ServerWebExchange exchange,final GatewayFilterChain chain){
        System.out.println("拦截……");
        /*final ServerHttpRequest request = exchange.getRequest();
        String token = request.getQueryParams().getFirst("token");
        if(token == null || token.length() <=0){
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);//此时网页显示 该网页无法正常运作,同时会有这样的 HTTP ERROR 401 提示
            return exchange.getResponse().setComplete();
        }*/

        /*ServerHttpResponse response = exchange.getResponse();
        final String json = "{\"code\":\"200\",\"msg\",\"操作成功\"}";
        response.writeWith(Mono.just(json));

        ServerHttpResponse response = exchange.getResponse();
        Map<Object, Object> map = Maps.newHashMap();
        map.put("code", 401);
        map.put("message", "非法请求！");
        map.put("cause", "Token not is null");

        ObjectMapper mapper = new ObjectMapper();
        try {
            byte[] bytes = mapper.writeValueAsBytes(map);
            // 输出错误信息到页面
            DataBuffer buffer = response.bufferFactory().wrap(bytes);
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
            return response.writeWith(Mono.just(buffer));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/

        return chain.filter(exchange);//如果不符合就放行
    }
}