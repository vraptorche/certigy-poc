package eu.unicorn.certigy.invoices.rest;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/invoices")
public class InvoicesController {
	@PostMapping("/{accountId}")
	@Operation(summary = "Settle account fees")
	public ResponseEntity<Void> settleFees(@PathVariable UUID accountId) {
		return ResponseEntity.noContent().build();
	}
}
