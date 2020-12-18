package com.zzf.util;


import org.apache.commons.codec.digest.DigestUtils;

public class Md5Util {

    /**
     * 生成签名 appid+q+salt+密钥 使用MD5 32位小写加密
     * @param q
     * @return
     */
    public static String getSign(String q){
        String text = "20201213000646509" + q + "1435660288" + "12ftBew9d9KRIDhFynnZ";
        String sign = DigestUtils.md5Hex(text);
        return sign;
    }
}
