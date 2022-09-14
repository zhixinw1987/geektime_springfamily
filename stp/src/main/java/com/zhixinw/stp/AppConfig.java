package com.zhixinw.stp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "app", name = "ctry", havingValue = "SG")
@ComponentScan("com.zhixinw.stp.service.impl.sg")
public class AppConfig {

}
