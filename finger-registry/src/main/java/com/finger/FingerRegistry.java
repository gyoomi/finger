/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.finger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/12 13:51
 */
@SpringBootApplication
@EnableEurekaServer
public class FingerRegistry {

    public static void main(String[] args) {
        SpringApplication.run(FingerRegistry.class, args);
    }
}
