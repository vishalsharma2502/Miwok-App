package com.example.android.miwok;

public class Word {

    public static final int NO_IMAGE_PROVIDED = -1;

    private String mdefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int maudioResourceId;

    public Word(String mdefaultTranslation, String mMiwokTranslation, int maudioResourceId) {
        this.mdefaultTranslation = mdefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.maudioResourceId = maudioResourceId;
    }

    public Word(String mdefaultTranslation, String mMiwokTranslation, int mImageResourceId, int maudioResourceId) {
        this.mdefaultTranslation = mdefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.maudioResourceId = maudioResourceId;
    }

    public String getMdefaultTranslation() {
        return mdefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getMaudioResourceId() {
        return maudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
