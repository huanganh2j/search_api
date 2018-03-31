package com.bitell.controller;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
* Company:bitell
* Author:an.huang
* Date:2018/3/26
*/
//@RestController
//@RequestMapping("/es")
public class EsController {
    @Autowired
    private TransportClient client;
    @ResponseBody
    @RequestMapping("/test")
    public GetResponse testEs(){
        GetResponse response = client.prepareGet("information", "article", "bitell").get();
        return response;
    }
}
