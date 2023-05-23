package eu.unicorn.certigy.accounts.rest;

import eu.unicorn.certigy.common.Account;
import eu.unicorn.certigy.common.Certificate;
import eu.unicorn.certigy.common.User;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
	@GetMapping("/{accountId}")
	@Operation(summary = "Get Account by Id")
	public ResponseEntity<Certificate> getAccount(@PathVariable("accountId") UUID accountId) {
		return ResponseEntity.ok().build();
	}

	@PostMapping()
	@Operation(summary = "Open Account Holder Account")
	public ResponseEntity<Void> openAccount(@RequestBody Account account) {
		return ResponseEntity.created(URI.create("someUri")).build();
	}

	@PostMapping("/{accountId}")
	@Operation(summary = "Add account user")
	public ResponseEntity<Void> addUser(@PathVariable String accountId, @RequestBody User user) {
		return ResponseEntity.created(URI.create("someUri")).build();
	}
}
