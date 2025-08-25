package kz.don.accounting_app.service;

import kz.don.accounting_app.dto.TransactionDTO;
import kz.don.accounting_app.entity.Transaction;
import kz.don.accounting_app.mapper.TransactionMapper;
import kz.don.accounting_app.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    public void saveTransaction(TransactionDTO transactionDTO) {
        Transaction transaction = transactionMapper.toEntity(transactionDTO);
        transactionRepository.save(transaction);
    }
}
