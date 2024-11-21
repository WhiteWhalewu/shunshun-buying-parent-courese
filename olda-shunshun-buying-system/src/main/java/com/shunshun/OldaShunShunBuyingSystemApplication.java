package com.shunshun;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.slf4j.*;

@SpringBootApplication
@Slf4j
public class OldaShunShunBuyingSystemApplication extends SpringBootServletInitializer {
   // private static final Logger log = org.slf4j.LoggerFactory.getLogger(OldaShunShunBuyingSystemApplication.class);
  //  private static final Logger log= org.slf4j.LoggerFactory.getLogger(OldaShunShunBuyingSystemApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(OldaShunShunBuyingSystemApplication.class, args);
        log.info("info");
        log.error("error");
        log.warn("warn");
    }

}