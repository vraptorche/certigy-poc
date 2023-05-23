package eu.unicorn.certigy.common;

import eu.unicorn.certigy.common.enums.CertificateStatus;
import eu.unicorn.certigy.common.enums.EnergyType;
import eu.unicorn.certigy.common.enums.EnergyUnit;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public record Certificate(

		UUID certificateId,
		ZonedDateTime issuanceDate,
		ZonedDateTime expirationDate,
		CertificateStatus status,
		EnergyType EnergyType,
		AccountHolder owner,
		List<ProductionDevice> devices,
		long volume,
		EnergyUnit unit

) {
}
