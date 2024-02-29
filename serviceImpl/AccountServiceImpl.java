package serviceImpl;

import model.AccountDto;
import model.UserDto;
import service.AccountService;
import service.AuthService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();
    List<AccountDto> accounts;
    private AccountServiceImpl(){
        this.accounts = new ArrayList<>();
    }
    public static AccountService getInstance(){return instance;}


    @Override
    public String createAccount(AccountDto account) {
        return null;
    }

    @Override
    public String deposit(AccountDto account) {
        return null;
    }

    @Override
    public String withdraw(AccountDto account) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        return null;
    }

    @Override
    public List<AccountDto> getAccounts() {
        return null;
    }
}
