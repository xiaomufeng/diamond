/*
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.taobao.diamond.client;

import java.util.concurrent.Executor;

import com.taobao.diamond.manager.DiamondManager;
import com.taobao.diamond.manager.ManagerListener;
import com.taobao.diamond.manager.impl.DefaultDiamondManager;

/**
 * 类DiamondClientTest.java的实现描述：TODO 类实现描述 
 * @author macun.mc 2015年12月4日 上午9:10:59
 */
public class DiamondClientTest {

    public static void main(String[] args){
        String group="DEFAULT_GROUP";
        String dataId="Test123";
        
        DiamondManager manager = new DefaultDiamondManager(group,dataId,new ManagerListener(){
            @Override
            public Executor getExecutor() {
                System.out.println("diamond client test executor.");
                return null;
            }
            @Override
            public void receiveConfigInfo(String configInfo) {
                System.out.println("diamond client test:"+configInfo);
                
            }
        });
    }
}
