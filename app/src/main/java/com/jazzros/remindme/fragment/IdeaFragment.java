package com.jazzros.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jazzros.remindme.R;

//import com.jazzros.remindme.R;

/**
 * Created by Oktay on 03.01.2016.
 */
public class IdeaFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;


    public static IdeaFragment getInstance(Context context) {
        Bundle args = new Bundle();

        IdeaFragment fragment = new IdeaFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_idea));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

}