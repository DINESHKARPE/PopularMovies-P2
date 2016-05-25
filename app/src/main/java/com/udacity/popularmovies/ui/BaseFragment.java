package com.udacity.popularmovies.ui;

import android.support.v4.app.Fragment;

import com.squareup.otto.Bus;
import com.udacity.popularmovies.event.DataBusProvider;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    protected Bus getDataBus() {
        return DataBusProvider.getBus();
    }

    @Override
    public void onStart() {
        super.onStart();
        getDataBus().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        getDataBus().unregister(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

}
