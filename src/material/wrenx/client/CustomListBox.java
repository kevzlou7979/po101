package material.wrenx.client;


import com.google.gwt.user.client.ui.ListBox;

public class CustomListBox extends ListBox
{
    private final String id;

    public CustomListBox()
    {
        this.id = String.valueOf(hashCode());
        getElement().setId(this.id);
    }

    @Override
    protected void onLoad()
    {
        super.onLoad();
        createInternalChangeHandler(this.id, this);
    }

    private void onChangeInternal()
    {
        // Do your thing!
    }

    private static native void createInternalChangeHandler(String id, CustomListBox self)
    /*-{
        var callback = $entry(function()
        {
            self.@material.wrenx.client.CustomListBox::onChangeInternal()();
        });

        $wnd.jQuery('#' + id).material_select();
        $wnd.jQuery('#' + id).change(callback);
    }-*/;
}