/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bishram.tour.guide.models;

public class LocationModel {

    /** Double value for the text view of RATING. */
    private double mRatings;

    /** Resource ID of image. */
    private int mImageResourceID;

    /** Integer value for the no of review get. */
    private int mReviewPoints;

    /** String for the name of the location. */
    private String mLocationName;

    /** String (the time) for the opening and closing schedule. */
    private String mSchedule;

    /**
     * Create a LocationModel object
     *
     * @param locationName is the string resource ID for the location, the actual name of the
     *                     location.
     * @param imageResourceID is the drawable image file that describes the location in the form
     *                        of picture.
     * @param ratings is the double, i.e., decimal value to show the Rating of the location.
     * @param reviewPoints is the integer value that counts the number of the review that user
     *                     has given to the location.
     * @param schedule is the time table of opening and closing of the location, if any.
     */
    public LocationModel(String locationName, int imageResourceID, double ratings, int reviewPoints,
                         String schedule) {
        mLocationName = locationName;
        mImageResourceID = imageResourceID;
        mRatings = ratings;
        mReviewPoints = reviewPoints;
        mSchedule = schedule;
    }

    /**
     * Return the String resource ID for the Title of the LocationModel.
     * @return mLocationName = Title of the Location.
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Return the drawable image resource ID for the LocationModel.
     * @return mImageResourceID = drawable image file for the location.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Return the double (decimal) value for the rating fo the LocationModel.
     * @return mRatings = value of stars for the Location.
     */
    public double getRatings() {
        return mRatings;
    }

    /**
     * Return the Integer value for the no of review of the LocationModel.
     * @return mReviewPoints = integer value of the review for the Location.
     */
    public int getReviewPoints() {
        return mReviewPoints;
    }

    /**
     * Return the string resource ID of the location opening closing time table of the LocationModel.
     * @return mSchedule = opening closing time table of the location.
     */
    public String getSchedule() {
        return mSchedule;
    }
}
