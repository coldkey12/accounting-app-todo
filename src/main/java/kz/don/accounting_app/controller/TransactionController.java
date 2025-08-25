package kz.don.accounting_app.controller;

import kz.don.accounting_app.dto.TransactionDTO;
import kz.don.accounting_app.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounting")
@RequiredArgsConstructor
@Slf4j
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<String> createTransaction(@RequestBody TransactionDTO transactionDTO) {

        log.info(transactionDTO.toString());

        transactionService.saveTransaction(transactionDTO);
        return ResponseEntity.ok("Transaction saved");
    }

    @GetMapping
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("good");
    }
}
