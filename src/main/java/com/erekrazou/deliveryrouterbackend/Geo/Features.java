package com.erekrazou.deliveryrouterbackend.Geo;

import java.util.ArrayList;
import java.util.List;

public class Features {
    List<Feature> features;

    public Features() {
        features = new ArrayList<Feature>();
    }

    public Features(List<Feature> features) {
        this.features = features;
    }

    public String asGeoJson() {
        StringBuilder json = new StringBuilder("{\"type\":\"FeatureCollection\",\"features\":[");
        for (Feature feature : features) {
            json.append(feature.asGeoJson());
            json.append(",");
        }
        json.deleteCharAt(json.length() - 1);
        json.append("]}");
        return json.toString();
    }

    public void addFeature(Feature feature) {
        features.add(feature);
    }
}
