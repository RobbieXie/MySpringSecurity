package com.tiandi.controller;

import com.tiandi.AuthenticationRequest;
import com.tiandi.mysql.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Justin on 2017/3/8.
 *
 * 测试用 !慎重!
 *
 */

@RestController
@RequestMapping("/root")
public class RootController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private AccountMapper accountMapper;


    @RequestMapping("/clean")
    public String clean() {
        System.out.println("清空并重置数据库 OK");
        accountMapper.resetDataBase();
        return "清空并重置数据库 OK";
    }
    @RequestMapping("/auth")
    public String auth(@RequestBody AuthenticationRequest authenticationRequest) throws AuthenticationException {
        // Perform the security
        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.getUsername(),
                        authenticationRequest.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return "Auth Successfully.";
    }
    @RequestMapping("/test")
    public String test() throws AuthenticationException {
        return "Login Index.";
    }

    @RequestMapping("/test2")
    public String test2() {
        return "Login Failure.";
    }

    @RequestMapping("/test3")
    public String test3() {
        return "Login successfully! Tiandi test.";
    }
}
