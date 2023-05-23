package eu.unicorn.certigy.common;

import java.util.List;
import java.util.UUID;

public record Account(
		UUID accountId,
		List<User> users) {
}
