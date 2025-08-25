package kz.don.accounting_app.mapper;

import kz.don.accounting_app.dto.TransactionDTO;
import kz.don.accounting_app.entity.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    Transaction toEntity(TransactionDTO transactionDTO);
}
