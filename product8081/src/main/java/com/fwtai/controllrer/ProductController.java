package com.fwtai.controllrer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-08 14:39
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
@RestController
@RequestMapping
public class ProductController{

    @Autowired
    private HttpServletRequest request;

    // http://127.0.0.1:8081/show
    // http://127.0.0.1:9002/PRODUCTCENTER/show
    @GetMapping("/show")
    public String show(final HttpServletResponse response){
        return "product，端口:8081";
    }
}