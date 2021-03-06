package jp.hideakisago.androidtemplate.viewcontrollers.menu;

import java.util.List;

/**
 * REST API の実行確認用 menu list 画面です。
 */
public class ApiListFragment extends AbsMenuListFragment {

    @Override
    protected List<Item> createItems() {

        return new ItemListBuilder()
                .add("API", mLog::trace)
                .add("API", mLog::trace)
                .add("API", mLog::trace)
                .items;
    }
}
