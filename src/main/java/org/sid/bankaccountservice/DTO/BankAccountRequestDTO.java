package org.sid.bankaccountservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BankAccountRequestDTO {
    private Double balance;
    private String currency;
    private sid.bankaccountservice.enums.AccountType type;
}
