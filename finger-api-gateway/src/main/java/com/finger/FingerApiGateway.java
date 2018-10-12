/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.finger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/12 14:03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class FingerApiGateway {

    public static void main(String[] args) {
        SpringApplication.run(FingerApiGateway.class, args);
    }
}
