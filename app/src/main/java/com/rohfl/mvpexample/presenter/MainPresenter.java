package com.rohfl.mvpexample.presenter;

import com.rohfl.mvpexample.interfaces.MainInterface;

public class MainPresenter {
    MainInterface mMainInterface;

    public MainPresenter(MainInterface mMainInterface) {
        this.mMainInterface = mMainInterface;
    }

    public void doTheTask(String s) {
        // in this I can do some api calls and then later pass that to the implemented function,
        // the presenter does not know how we are showing the data, it just passes the data to the view
        //
        mMainInterface.changeText(s);
    }

}
