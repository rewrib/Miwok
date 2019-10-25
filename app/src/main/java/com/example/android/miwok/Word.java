package com.example.android.miwok;

public class Word {

    // default translation of a word
    private String mDefaultTranslation;

    // Miwok translation of a word
    private String mMiwokTranslation;

    // image resource ID
    private int mImageId = NO_IMAGE;

    private int mAudioId;

    private static final int NO_IMAGE = -1;


    // constructor without picture
    public Word(String defaultTranslation, String miwokTranslation, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioId = audioId;
    }

    // second constructor with image support
    public Word(String defaultTranslation, String miwokTranslation, int imageId, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageId = imageId;
        mAudioId = audioId;
    }

    // getter methods

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getAudioId() {
        return mAudioId;
    }


    public int getImageId() {
        return mImageId;
    }
    public boolean hasImage() {
        return mImageId != NO_IMAGE;
    }
}
