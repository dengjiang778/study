package com.example.demo.Interceptor;

import com.example.demo.mapper.AuthorityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public class SimpleAuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    private AuthorityMapper authorityMapper;

    //简单拦截器示例
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Long userId = (Long) session.getAttribute("userId");
        List<String> authorityList = authorityMapper.findByUser(userId);
        String requestURI = request.getRequestURI();
        if (authorityList.contains(requestURI)) {
            return true;
        } else {
            throw new Exception("拒绝访问！");
        }
    }
}
