package eu.unicorn.certigy.common;

import eu.unicorn.certigy.common.enums.EnergyType;
import eu.unicorn.certigy.common.enums.EnergyUnit;
import eu.unicorn.certigy.common.enums.PeriodType;

import java.time.ZonedDateTime;

public record MeteredData(
		long volume,
		EnergyUnit unit,
		EnergyType type,
		ZonedDateTime from,
		ZonedDateTime to,
		PeriodType period,
		ProductionDevice device) {
}
