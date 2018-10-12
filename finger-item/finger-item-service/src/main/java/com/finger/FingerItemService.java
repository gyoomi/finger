/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.finger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/12 14:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FingerItemService {

    public static void main(String[] args) {
        SpringApplication.run(FingerItemService.class, args);
    }
}
