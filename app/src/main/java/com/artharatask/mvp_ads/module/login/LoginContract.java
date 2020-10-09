package com.artharatask.mvp_ads.module.login;

import com.artharatask.mvp_ads.base.BasePresenter;
import com.artharatask.mvp_ads.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
