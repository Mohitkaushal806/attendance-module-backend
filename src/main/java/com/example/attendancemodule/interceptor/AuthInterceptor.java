package com.example.attendancemodule.interceptor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthInterceptor implements HandlerInterceptor {
    private static final String SERVER_IP_ADDRESS = "103.219.213.50";
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestIp = request.getHeader("ipAddress");
        if(requestIp.equals(SERVER_IP_ADDRESS)){
            return true;
        }else{
            return true;
        }
    }

}
