package com.zhanglu.chapter2.test;

import com.zhanglu.chapter2.model.Customer;
import org.junit.Assert;
import org.junit.Before;
import com.zhanglu.chapter2.service.CustomerService;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void  createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name","customer100");
        fieldMap.put("contact","John");
        fieldMap.put("telephone","13512345678");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact","Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
