package jp.hideakisago.androidtemplate.viewcontrollers.menu;

import java.util.List;

public class ApiListFragment extends AbsMenuListFragment {

    @Override
    protected List<Item> createItems() {

        return new ItemListBuilder()
                .add("API", new Runnable() {
                    @Override
                    public void run() {
                        mLog.trace();
                    }
                })
                .add("API", new Runnable() {
                    @Override
                    public void run() {
                        mLog.trace();
                    }
                })
                .add("API", new Runnable() {
                    @Override
                    public void run() {
                        mLog.trace();
                    }
                })
                .items;
    }
}