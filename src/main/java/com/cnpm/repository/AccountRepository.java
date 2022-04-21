/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnpm.repository;

import com.cnpm.pojos.Account;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface AccountRepository {
    boolean addAccount(Account acc);
    List<Account> getAccount(String username);

}
