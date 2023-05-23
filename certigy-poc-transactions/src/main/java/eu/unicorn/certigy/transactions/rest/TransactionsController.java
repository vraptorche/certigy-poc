package eu.unicorn.certigy.transactions.rest;

import eu.unicorn.certigy.common.TransactionData;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {

	@GetMapping("/list/{accountId}")
	@Operation(summary = "Get account transactions")
	public ResponseEntity<List<TransactionData>> getTransaction(@PathVariable UUID accountId) {
		return ResponseEntity.ok().build();
	}

	@GetMapping("/{transactionId}")
	@Operation(summary = "Get transaction data")
	public ResponseEntity<TransactionData> listTransactions(@PathVariable UUID transactionId) {
		return ResponseEntity.ok().build();
	}

	@PostMapping
	@Operation(summary = "Schedule transaction to issue certificate")
	public ResponseEntity<Object> scheduleTransaction(TransactionData data) {
		return ResponseEntity.created(URI.create("someUri")).build();
	}
}
