package ch.ethz.nlp.headline;

import java.util.ResourceBundle;

import com.google.common.base.Optional;

public class Config {

	private final Optional<String> filterDocumentId;

	public Config() {
			filterDocumentId = Optional.absent();
	}

	public Optional<String> getFilterDocumentId() {
		return filterDocumentId;
	}

}
