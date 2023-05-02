package com.erekrazou.deliveryrouterbackend.services;

import com.erekrazou.deliveryrouterbackend.Geo.Features;
import com.erekrazou.deliveryrouterbackend.Geo.Line;
import com.erekrazou.deliveryrouterbackend.Geo.Point;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GeoServiceImplementation implements GeoService {
    @Override
    public ResponseEntity<Object> theOne() {
        Features features = new Features();
        features.addFeature(new Point(41.09106505, 23.54979639));
        features.addFeature(new Line(new Point(41.09106505, 23.54979639), new Point(40.90787715, 23.50035572)));

        return ResponseEntity.ok(features.asGeoJson());
    }
}
