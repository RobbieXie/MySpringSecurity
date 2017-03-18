package com.tiandi.service.imp;

import com.tiandi.mysql.entity.AccountDO;
import com.tiandi.mysql.mapper.AccountMapper;
import com.tiandi.service.AccountService;
import com.tiandi.web.BaseResult;
import com.tiandi.web.dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Justin on 2017/3/8.
 * 用户相关服务实现
 */

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 用户注册
     * @param accountDTO
     * @return
     */
    @Override
    public BaseResult<Object> register(AccountDTO accountDTO) {

        if (accountMapper.getAccountByUsername(accountDTO.getUsername()) != null) {
            return new BaseResult<>(500, "用户已经存在");
        }
        accountMapper.insert(new AccountDO(accountDTO));
        return new BaseResult<>();
    }

    /**
     * 更新用户信息
     * @param accountDTO
     * @return
     */
    @Override
    public BaseResult<Object> update(AccountDTO accountDTO) {
        if (accountMapper.getAccountByUsername(accountDTO.getUsername()) == null) {
            return new BaseResult<>(500, "该用户不存在");
        }
        accountMapper.update(new AccountDO(accountDTO));
        return new BaseResult<>();
    }

    /**
     * 删除用户
     * @param userName
     * @return
     */
    @Override
    public BaseResult<Object> deleteAccount(String userName) {
        if (accountMapper.getAccountByUsername(userName) == null) {
            return new BaseResult<>(500, "该用户不存在");
        }
        accountMapper.deleteAccount(userName);
        return new BaseResult<>();
    }


}
