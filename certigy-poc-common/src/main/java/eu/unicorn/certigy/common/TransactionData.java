package eu.unicorn.certigy.common;

import eu.unicorn.certigy.common.enums.PeriodType;

import java.time.ZonedDateTime;
import java.util.Set;

public record TransactionData(
		ZonedDateTime startDate,
		ZonedDateTime endDate,
		PeriodType periodType,
		Account account,
		Set<ProductionDevice> devices) {
}
