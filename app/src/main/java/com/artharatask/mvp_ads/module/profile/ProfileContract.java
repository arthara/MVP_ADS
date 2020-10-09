package com.artharatask.mvp_ads.module.profile;

import com.artharatask.mvp_ads.base.BasePresenter;
import com.artharatask.mvp_ads.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void goBackToLogin();

        void updateProfile(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void getProfile();
    }
}
