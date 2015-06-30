package material.wrenx.client;

import gwt.material.design.client.ui.MaterialToast;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Wrenx implements EntryPoint {

	public void onModuleLoad() {
		final CustomListBox list = new CustomListBox();
		list.addItem("Test");
		list.addItem("item2");
		list.addItem("item3");
		list.addChangeHandler(new ChangeHandler() {
			
			@Override
			public void onChange(ChangeEvent event) {
				MaterialToast.alert(String.valueOf(list.getSelectedIndex()));
			}
		});
		RootPanel.get().add(list);
	}
}
