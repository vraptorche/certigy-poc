package eu.unicorn.certigy.common;

import eu.unicorn.certigy.common.enums.EnergyType;
import eu.unicorn.certigy.common.enums.FuelValency;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public record ProductionDevice(
		UUID deviceId,
		EnergyType type,
		String description,
		FuelValency fuelValency,
		Map<String, Short> fuelQuotas,
		Map<String, String> parameters,
		Set<DeviceLicense> licenses
) {
}
