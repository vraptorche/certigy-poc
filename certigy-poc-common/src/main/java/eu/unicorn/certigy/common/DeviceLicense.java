package eu.unicorn.certigy.common;

import java.time.ZonedDateTime;

public record DeviceLicense(
		ZonedDateTime issuanceDate,
		ZonedDateTime expirationDate,
		String description,
		String issuingOrganization) {

}
