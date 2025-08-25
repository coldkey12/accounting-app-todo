package kz.don.accounting_app.dto;

import lombok.Data;

@Data
public class TransactionDTO {

    private String userId;

    private String productId;

    private String transactionType;

    private double sum;
    private int quantity;

    private double pricePerPiece;
}
