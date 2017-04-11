package org.cytoscape.application.swing.search;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.JComponent;

import org.cytoscape.work.TaskFactory;
import org.cytoscape.work.TaskManager;
import org.cytoscape.work.TaskObserver;

/**
 * Task Factory that has to be implemented in order to create and register a Network Search provider.
 */
public interface NetworkSearchTaskFactory extends TaskFactory {
	
	/**
	 * Returns the unique id of this network search provider.
	 * Use namespaces to make sure it is unique (e.g. "org.myCompany.mySearch").
	 * @return A unique id for this search provider.
	 */
	String getId();
	
	/**
	 * A short name to be displayed to the user.
	 * @return The name of this search provider.
	 */
	String getName();

	/**
	 * An optional short text describing what this search provider does.
	 * @return A text that describes this search provider, which can be null.
	 */
	String getDescription();
	
	/**
	 * An icon that represents this search provider.
	 * @return If null, Cytoscape may provide a default or random icon for this search provider.
	 */
	Icon getIcon();
	
	/**
	 * An optional URL the user can use to find more information about this search provider.
	 * @return A URL to a website, which can be null.
	 */
	URL getWebsite();

	/**
	 * If you want to be notified when the search task is finished, you should return a TaskObserver here.
	 * For example, you may want to display a dialog with a list of multiple network results,
	 * in case the user has to select one of them before the final network is created.
	 * @return Optional {@link TaskObserver} to be passed to the {@link TaskManager} when running the search task(s)
	 *         created by this TaskFactory.
	 */
	TaskObserver getTaskObserver();
	
	/**
	 * @return If null, Cytoscape will create a basic search field for you.
	 */
	JComponent getQueryComponent();
	
	/**
	 * @return If null, extra search options will not be available to the end user.
	 */
	JComponent getOptionsComponent();
}
