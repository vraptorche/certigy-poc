package eu.unicorn.certigy.devices.rest;

import eu.unicorn.certigy.common.Certificate;
import eu.unicorn.certigy.common.MeteredData;
import eu.unicorn.certigy.common.ProductionDevice;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/devices")
public class DevicesController {


	@GetMapping("/{deviceId}")
	@Operation(summary = "Get production device by id")
	public ResponseEntity<Certificate> getCertificate(@PathVariable UUID deviceId) {
		return ResponseEntity.ok().build();
	}

	@PostMapping
	@Operation(summary = "Create production device")
	public ResponseEntity<Void> registerDevice(@RequestBody ProductionDevice device) {
		return ResponseEntity.created(URI.create("someUri")).build();
	}


	@GetMapping("/data/{deviceId}/list")
	@Operation(summary = "Store device data")
	public ResponseEntity<List<MeteredData>> listDeviceData(@PathVariable UUID deviceId) {
		return ResponseEntity.ok().build();
	}

	@PostMapping("/data/{deviceId}")
	@Operation(summary = "Store device data")
	public ResponseEntity<Void> storeData(@PathVariable String deviceId, @RequestBody MeteredData data) {
		return ResponseEntity.created(URI.create("someUri")).build();
	}
}
