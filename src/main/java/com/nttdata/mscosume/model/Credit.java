package com.nttdata.mscosume.model;

import lombok.Data;

@Data
public class Credit {

    private String id;
    private String idClient;
    private String cardNumber;
    private String typeCredit;
    private String accountNumber;
    private Float balance;
    private Float credit;
    private Float debt;

}
