package com.olaover.inmortaltech.ola;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {
    public static final String MY_PREFERENCES = "MY_PREFERENCES";
    public static final int MODE = Context.MODE_PRIVATE;
    private static SharedPreference pref;
    private SharedPreferences sharedPreference;
    private SharedPreferences.Editor editor;

    public SharedPreference(Context context) {
        sharedPreference = context.getSharedPreferences(MY_PREFERENCES, MODE);
        editor = sharedPreference.edit();
    }
    public static SharedPreference getInstance(Context context) {
        if (pref == null) {
            pref = new SharedPreference(context);
        }
        return pref;
    }

    public String getString(String key, String defValue) {
        return sharedPreference.getString(key, defValue);
    }

    public void putString(String key, String value) {
        editor.putString(key, value).commit();
    }


    public void putBoolean(String key, boolean value) {
        editor.putBoolean(key, value).commit();
    }


    public boolean contains(String key) {
        return sharedPreference.contains(key);
    }

    public void remove(String key) {
        editor.remove(key).commit();
    }

    public void clear() {
        editor.clear().commit();
    }
}