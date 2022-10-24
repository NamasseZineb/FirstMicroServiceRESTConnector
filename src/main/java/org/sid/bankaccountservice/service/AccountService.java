package org.sid.bankaccountservice.service;

import org.sid.bankaccountservice.DTO.BankAccountRequestDTO;
import org.sid.bankaccountservice.DTO.BankAccountResponseDTO;
import org.sid.bankaccountservice.entities.BankAccount;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    //public BankAccount toBankAccount(BankAccountRequestDTO bankAccountRequestDTO);
}
