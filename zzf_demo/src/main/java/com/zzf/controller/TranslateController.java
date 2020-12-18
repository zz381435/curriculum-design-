package com.zzf.controller;

import com.alibaba.fastjson.JSONObject;
import com.zzf.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 翻译控制层
 */
@Controller
public class TranslateController {


    /**
     *  Spring SpringMVC
     */
    @Autowired
    private TranslateService translateService;

    @RequestMapping("/translate")
    @ResponseBody
    public JSONObject translate(String text){
        JSONObject jsonObject = translateService.translate(text);
        return jsonObject;
    }



}
