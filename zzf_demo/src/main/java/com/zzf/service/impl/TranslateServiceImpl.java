package com.zzf.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zzf.service.TranslateService;
import com.zzf.util.HttpUtil;
import com.zzf.util.Md5Util;
import org.springframework.stereotype.Service;


/**
 * https://api.fanyi.baidu.com/doc/21
 * APP ID：20201213000646509
  密钥：12ftBew9d9KRIDhFynnZ
 */
@Service
public class TranslateServiceImpl implements TranslateService {


    @Override
    public JSONObject translate(String text) {
        // 生成签名
        String sign = Md5Util.getSign(text);
        String url = "http://api.fanyi.baidu.com/api/trans/vip/translate?q=" + text + "&from=zh&to=en&appid=20201213000646509&salt=1435660288&sign=" + sign;
        JSONObject jsonObject = HttpUtil.sendGet(url);
        return jsonObject;
    }
}
