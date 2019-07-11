package com.java98k.alipayDemo.service.impl;

import com.alipay.api.AlipayApiException;
import com.java98k.alipayDemo.bean.AlipayBean;
import com.java98k.alipayDemo.config.AlipayUtil;
import com.java98k.alipayDemo.service.PayService;
import org.springframework.stereotype.Service;

/* 支付服务 */
@Service(value = "payService")
public class PayServiceImpl implements PayService {


    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return AlipayUtil.connect(alipayBean);
    }

}
