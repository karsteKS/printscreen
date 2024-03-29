package printscreen;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

class Browser extends Region {

	private final WebView browser = new WebView();

	Browser(String url) {
		WebEngine webEngine = browser.getEngine();
		webEngine.load(url);

		getChildren().add(browser);
	}

	Boolean isPageLoaded() {
		return browser.getEngine().getDocument() != null;
	}

	@Override
	protected void layoutChildren() {
		double w = getWidth();
		double h = getHeight();
		layoutInArea(browser, 0, 0, w, h, 0, HPos.CENTER, VPos.CENTER);

	}

	@Override
	protected double computePrefWidth(double width) {
		return 1920;
	}

	@Override
	protected double computePrefHeight(double height) {
		return 1080;
	}

}
