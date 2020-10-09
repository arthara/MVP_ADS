package com.artharatask.mvp_ads.module.profile;

import android.view.View;

import com.artharatask.mvp_ads.base.BaseFragmentHolderActivity;

public class ProfileActivity extends BaseFragmentHolderActivity {
    private ProfileFragment profileFragment;

    @Override
    protected void initializeFragment() {
        initializeView();

        btnBack.setVisibility(View.VISIBLE);
        btnOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        profileFragment = new ProfileFragment();
        btnBack.setOnClickListener(view -> profileFragment.goBackToLogin());
        setCurrentFragment(profileFragment, true);
    }
}
