package com.erekrazou.deliveryrouterbackend.Geo;

public class Line implements Feature {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public double getStartLatitude() {
        return start.getLatitude();
    }

    public double getStartLongitude() {
        return start.getLongitude();
    }

    public Point getEnd() {
        return end;
    }

    public double getEndLatitude() {
        return end.getLatitude();
    }

    public double getEndLongitude() {
        return end.getLongitude();
    }

    public String asGeoJson() {
        return "{\"type\":\"Feature\",\"properties\":{},\"geometry\":{\"coordinates\":[[" + start.getLongitude() + "," + start.getLatitude() + "],[" + end.getLongitude() + "," + end.getLatitude() + "]],\"type\":\"LineString\"}}";
    }

}
