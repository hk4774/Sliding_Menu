package com.hk4774.navigationdrawer;

/**
 * Created by hk4774 on 09-09-2016.
 */
public class RowItem {

    private String title;
    private int icon;

    public RowItem(String title, int icon) {
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
