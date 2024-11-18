package com.xyzbank.mstransactions.mstransactions.service.impl;

import com.xyzbank.mstransactions.mstransactions.model.Transaction;
import com.xyzbank.mstransactions.mstransactions.repository.TransactionRepository;
import com.xyzbank.mstransactions.mstransactions.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Override
    public Flux<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public Mono<Transaction> getTransaction(String id) {
        return transactionRepository.findById(id)
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "Transacción no encontrada")));
    }

    @Override
    public Mono<Void> deleteTransaction(String id) {
        return transactionRepository.deleteById(id);
    }

}
