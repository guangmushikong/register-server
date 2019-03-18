/**************************************
 * Copyright (C), Navinfo
 * Package: com.lbi.tile.config
 * Author: liumingkai05559
 * Date: Created in 2019/3/16 18:58
 **************************************/
package com.guangmushikong.lbi.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*************************************
 * Class Name: SecurityConf
 * Description:〈安全配置〉
 * @author liumingkai
 * @create 2019/3/16
 * @since 1.0.0
 ************************************/
@EnableWebSecurity
public class SecurityConf extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http)throws Exception{
        http.csrf().disable();
        super.configure(http);
    }
}
