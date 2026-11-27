package org.telegram.ui;

import static org.telegram.messenger.LocaleController.getString;

import android.content.Context;
import android.view.View;

import org.telegram.messenger.R;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.utils.settings.SharedSettings;

import java.util.ArrayList;

/** BenchGram privacy and customization settings screen. */
public class BenchGramSettingsActivity extends UniversalFragment {
    private static final int ID_GHOST_STORIES = 1;
    private static final int ID_SAVE_DELETED_MESSAGES = 2;

    @Override
    protected boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public View createView(Context context) {
        setHasOwnBackground(true);
        fragmentView = super.createView(context);
        listView.setSections();
        listView.setSectionsDrawBackground(true);
        return fragmentView;
    }

    @Override
    protected RecyclerListView getListViewForSimpleGlass() {
        return listView;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    protected CharSequence getTitle() {
        return getString(R.string.BenchGramSettings);
    }

    @Override
    protected void fillItems(ArrayList<UItem> items, UniversalAdapter adapter) {
        items.add(UItem.asHeader(getString(R.string.BenchGramStoriesSection)));
        items.add(
            UItem.asCheck(ID_GHOST_STORIES, getString(R.string.BenchGramGhostStories))
                .setChecked(SharedSettings.benchGramGhostStories.get())
        );
        items.add(UItem.asShadow(getString(R.string.BenchGramGhostStoriesInfo)));

        items.add(UItem.asHeader(getString(R.string.BenchGramMessagesSection)));
        items.add(
            UItem.asCheck(ID_SAVE_DELETED_MESSAGES, getString(R.string.BenchGramSaveDeletedMessages))
                .setChecked(SharedSettings.benchGramSaveDeletedMessages.get())
        );
        items.add(UItem.asShadow(getString(R.string.BenchGramSaveDeletedMessagesInfo)));
    }

    @Override
    protected void onClick(UItem item, View view, int position, float x, float y) {
        if (item.id == ID_GHOST_STORIES) {
            SharedSettings.benchGramGhostStories.toggle();
            listView.adapter.update(true);
        } else if (item.id == ID_SAVE_DELETED_MESSAGES) {
            SharedSettings.benchGramSaveDeletedMessages.toggle();
            listView.adapter.update(true);
        }
    }

    @Override
    protected boolean onLongClick(UItem item, View view, int position, float x, float y) {
        return false;
    }
}
