//package com.example.demo.Config;
//
//import com.example.demo.security.MyPasswordEncoder;
//import com.example.demo.security.UserDetailServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
////    @Autowired
////    private UserDetailServiceImpl userDetailService;
//    @Autowired
//    private MyPasswordEncoder myPasswordEncoder;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/admin/**").hasRole("USER");
//
//        http.formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/index")
//                .and()
//                .logout().logoutUrl("/logout").permitAll();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailService).passwordEncoder(myPasswordEncoder);
//    }
//
//}
