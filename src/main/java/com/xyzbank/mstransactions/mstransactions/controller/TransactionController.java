package com.xyzbank.mstransactions.mstransactions.controller;
//Define un endpoint para probar la conexión.

import com.xyzbank.mstransactions.mstransactions.model.Transaction;
import com.xyzbank.mstransactions.mstransactions.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @GetMapping("/transacciones/historial")
    public Flux<Transaction> getAllTransactions() {
        return service.getAllTransactions();
    }
}
