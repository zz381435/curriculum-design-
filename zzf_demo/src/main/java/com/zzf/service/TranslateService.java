package com.zzf.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 翻译service
 */
public interface TranslateService {


    JSONObject translate(String text);
}
