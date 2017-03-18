package com.tiandi.service;

import com.tiandi.web.BaseResult;
import com.tiandi.web.dto.AccountDTO;

/**
 * Created by Justin on 2017/3/8.
 * 用户相关服务接口
 */

public interface AccountService {

    /**
     * 用户注册
     */
    BaseResult<Object> register(AccountDTO accountDTO);

    /**
     * 删除用户
     */
    BaseResult<Object> deleteAccount(String userName);

    /**
     * 更新用户信息
     * @param accountDTO
     * @return
     */
    BaseResult<Object> update(AccountDTO accountDTO);
}
