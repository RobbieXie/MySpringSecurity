package com.tiandi.controller;

import com.tiandi.service.AccountService;
import com.tiandi.web.BaseResult;
import com.tiandi.web.dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Justin on 2017/3/8.
 * 用户相关web接口
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 用户注册
     * @param accountDTO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public BaseResult<Object> register(@RequestBody AccountDTO accountDTO) {
        return accountService.register(accountDTO);
    }

    /**
     * 删除用户
     * @param userName
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BaseResult<Object> deleteAccount(@RequestParam("username") String userName){
        return accountService.deleteAccount(userName);
    }

    /**
     * 更新用户信息
     * @param accountDTO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult<Object> update(@RequestBody AccountDTO accountDTO) {
        return accountService.update(accountDTO);
    }
}
