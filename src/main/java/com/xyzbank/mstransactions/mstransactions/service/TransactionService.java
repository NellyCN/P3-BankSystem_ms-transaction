package com.xyzbank.mstransactions.mstransactions.service;

import com.xyzbank.mstransactions.mstransactions.model.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@Service
public interface TransactionService {

    public Flux<Transaction> getAllTransactions();
    public Mono<Transaction> getTransaction(String id);
    public Mono<Void> deleteTransaction(String id);

}
