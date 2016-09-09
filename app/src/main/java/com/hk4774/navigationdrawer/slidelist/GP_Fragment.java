package com.hk4774.navigationdrawer.slidelist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hk4774.navigationdrawer.R;

/**
 * Created by hk4774 on 09-09-2016.
 */
public class GP_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fb_fragment, container, false);
        return rootView;
    }
}
