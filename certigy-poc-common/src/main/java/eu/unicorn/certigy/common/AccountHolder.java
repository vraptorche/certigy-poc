package eu.unicorn.certigy.common;

import liquibase.hub.model.Organization;

import java.util.List;

public record AccountHolder(
		Organization organization,
		List<Account> accounts
) {

}
