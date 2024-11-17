package com.xyzbank.mstransactions.mstransactions.service;

import com.xyzbank.mstransactions.mstransactions.model.Transaction;
import com.xyzbank.mstransactions.mstransactions.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Flux<Transaction> getAllTransactions() {
        return repository.findAll();
    }
}
