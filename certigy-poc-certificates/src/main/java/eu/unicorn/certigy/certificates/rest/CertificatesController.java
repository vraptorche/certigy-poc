package eu.unicorn.certigy.certificates.rest;

import eu.unicorn.certigy.common.Certificate;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/certificates")
public class CertificatesController {

	@GetMapping("/{certificateId}")
	@Operation(summary = "Get certificate by id")
	public ResponseEntity<Certificate> getCertificate(@PathVariable UUID certificateId) {
		return ResponseEntity.ok().build();
	}

	@PostMapping()
	@Operation(summary="Issue certificate")
	public ResponseEntity<Void> issueCertificate(@RequestBody Certificate certificate) {
		return ResponseEntity.created(URI.create("someUri")).build();
	}@PostMapping("/import")
	@Operation(summary="Import certificate")
	public ResponseEntity<Void> importCertificate(@RequestBody Certificate certificate) {
		return ResponseEntity.created(URI.create("someUri")).build();
	}

	@GetMapping("/export/{certificateId}")
	@Operation(summary = "Export certificate")
	public ResponseEntity<Certificate> exportCertificate(@PathVariable UUID certificateId) {
		return ResponseEntity.ok().build();
	}

	@PutMapping("/cancel/{certificateId}")
	@Operation(summary="Cancel certificate")
	public ResponseEntity<Void> cancelCertificate(@PathVariable UUID certificateId) {
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/transfer/{certificateId}/to/{accountId}")
	@Operation(summary="Transfer certificate to another account")
	public ResponseEntity<Void> transferCertificate(@PathVariable UUID certificateId, @PathVariable UUID accountId) {
		return ResponseEntity.noContent().build();
	}

}
