package com.nttdata.mscosume.model;

import java.util.Date;
import lombok.Data;

@Data
public class Movements {
    private String id;
    private String idProduct;
    private String type;
    private Float amount;
    private String idThirdPartyProduct;
    private Date date;
}