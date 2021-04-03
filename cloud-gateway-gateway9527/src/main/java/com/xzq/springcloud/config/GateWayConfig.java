package com.xzq.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: yuzh
 * @Date: 2021/4/3 16:49
 * @Description:
 */
@Configuration
public class GateWayConfig {

    //手动配置路由
    @Bean
    public RouteLocator customRouteLactor(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_1",r ->r.path("/guonei").uri("https://news.baidu.com/guonei")).build();
        routes.route("path_route_2",r ->r.path("/guoji").uri("https://news.baidu.com/guoji")).build();

        return routes.build();
    }
}
