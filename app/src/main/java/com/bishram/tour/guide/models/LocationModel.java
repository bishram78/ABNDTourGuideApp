package com.bishram.tour.guide.models;

public class LocationModel {

    /** Double value for the text view of RATING. */
    private double mRatings;

    /** Resource ID of image. */
    private int mImageResourceID;

    /** Integer value for the no of review get. */
    private int mReviewPoints;

    /** Double value for the distance of the location from certain place. */
    private String mDistanceMsg;

    /** String for the name of the location. */
    private String mLocationName;

    /** String (the time) for the opening and closing schedule. */
    private String mSchedule;

    /** Construction of the class */
    public LocationModel(String locationName, int imageResourceID, double ratings, int reviewPoints,
                         String distanceMsg, String schedule) {
        mLocationName = locationName;
        mImageResourceID = imageResourceID;
        mRatings = ratings;
        mReviewPoints = reviewPoints;
        mDistanceMsg = distanceMsg;
        mSchedule = schedule;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public double getRatings() {
        return mRatings;
    }

    public int getReviewPoints() {
        return mReviewPoints;
    }

    public String getDistanceMsg() {
        return mDistanceMsg;
    }

    public String getSchedule() {
        return mSchedule;
    }
}
