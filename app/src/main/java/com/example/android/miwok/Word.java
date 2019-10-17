package com.example.android.miwok;

public class Word {

    // default translation of a word
    private String mDefaultTranslation;

    // Miwok translation of a word
    private String mMiwokTranslation;

    // image resource ID
    private int mImageId = NO_IMAGE;

    private static final int NO_IMAGE = -1;


    // constructor without picture
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // second constructor with image support
    public Word(String defaultTranslation, String miwokTranslation, int imageId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageId = imageId;
    }

    // getter methods

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getImageId() {
        return mImageId;
    }
    public boolean hasImage() {
        return mImageId != NO_IMAGE;
    }
}
