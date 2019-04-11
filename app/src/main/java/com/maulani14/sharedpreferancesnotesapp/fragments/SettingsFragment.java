package com.maulani14.sharedpreferancesnotesapp.fragments;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.maulani14.sharedpreferancesnotesapp.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences ( Bundle bundle , String s ) {
        addPreferencesFromResource( R.xml.preferences);
    }
}
