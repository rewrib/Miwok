package com.example.android.miwok;

public class Word {

    // default translation of a word
    private String mDefaultTranslation;

    // default translation of a word
    private String mMiwokTranslation;


    // constructor

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // getter methods

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
