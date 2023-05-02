package com.erekrazou.deliveryrouterbackend.Geo;

public class Point implements Feature {
    double latitude;
    double longitude;

    public Point(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String asGeoJson() {
        return "{\"type\":\"Feature\",\"properties\":{},\"geometry\":{\"coordinates\":[" + longitude + "," + latitude + "],\"type\":\"Point\"}}";
    }
}
