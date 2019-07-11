package com.java98k.alipayDemo.service;

import com.alipay.api.AlipayApiException;
import com.java98k.alipayDemo.bean.AlipayBean;

/*支付服务*/
public interface PayService {

    /*支付宝*/
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;
}
