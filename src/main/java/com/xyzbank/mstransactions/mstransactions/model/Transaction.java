package com.xyzbank.mstransactions.mstransactions.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String type;
    private Double amount;
    private LocalDateTime date;
    private String sourceAccount;
    private String destinationAccount;
}
