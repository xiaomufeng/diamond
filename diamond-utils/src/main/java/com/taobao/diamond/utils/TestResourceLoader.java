/*
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.taobao.diamond.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * 类TestResourceLoader.java的实现描述：TODO 类实现描述 
 * @author macun.mc 2015年12月6日 下午10:18:47
 */
public class TestResourceLoader {

    public static void main(String[] args){
        InputStream in = null;
        try {
            in = ResourceUtils.getResourceAsStream("node.properties");
            Properties nodeProperties = new Properties();
            nodeProperties.load(in);

            Enumeration<?> enu = nodeProperties.propertyNames();
            while (enu.hasMoreElements()) {
                String address = (String) enu.nextElement();
                System.out.println(address);
            }
        }
        catch (IOException e) {
            System.out.println("加载节点配置文件失败");
        }
    }
}
