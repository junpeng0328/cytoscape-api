package org.cytoscape.io.webservice.swing;

import java.awt.Container;

import org.cytoscape.io.webservice.client.AbstractWebServiceClient;

/**
 * Abstract class for web service client with Swing GUI.
 *
 */
public abstract class AbstractWebServiceGUIClient extends AbstractWebServiceClient implements WebServiceGUIClient {

	// Client GUI.  If this is null, default GUI will be used. 
	protected Container gui;

	public AbstractWebServiceGUIClient(final String uri, final String displayName, final String description) {
		super(uri, displayName, description);
	}

	@Override
	public Container getQueryBuilderGUI() {
		return gui;
	}

}