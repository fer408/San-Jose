package com.example.android.sanjosetour;

/**
 * Created by fernando on 8/25/16.
 */
public class Data {

    private int mInfo;


    private int mAdress;


    private int mImageResourceId = NO_IMAGE_PROVIDED;


    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     *  @param info is the info givem
     *
     * @param address is the adress given.
     */
    public Data(int info, int address, int imageResourceId) {
        mInfo = info;
        mAdress = address;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public int getmInfo() {
        return mInfo;
    }


    public int getmAdress() {
        return mAdress;

    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
