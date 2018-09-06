package com.zhanglu.chapter2.test;

import com.zhanglu.chapter2.model.Customer;
import org.junit.Assert;
import org.junit.Before;
import com.zhanglu.chapter2.service.CustomerService;
import org.junit.Test;

import java.util.List;


public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() {
        // TODO: 2018/9/6 初始化数据库
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> CustomerList = customerService.getCustomerList();
        Assert.assertEquals(2,CustomerList.size());
    }


}
