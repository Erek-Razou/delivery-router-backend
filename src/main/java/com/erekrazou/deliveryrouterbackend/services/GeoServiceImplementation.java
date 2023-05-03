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

        Point serres = new Point(41.092083, 23.541016);
        Point provatas = new Point(41.068238, 23.390686);
        Point aKamila = new Point(41.058320, 23.424134);
        Point kKamila = new Point(41.020431, 23.483293);
        Point kMitrousi = new Point(41.058680, 23.457547);
        Point koumaria = new Point(41.016434, 23.434656);
        Point skoutari = new Point(41.020032, 23.520701);
        Point adelfiko = new Point(41.014645, 23.457354);
        Point agEleni = new Point(41.003545, 23.559196);
        Point peponia = new Point(40.988154, 23.516756);

        features.addFeature(serres);
        features.addFeature(provatas);
        features.addFeature(aKamila);
        features.addFeature(kKamila);
        features.addFeature(kMitrousi);
        features.addFeature(koumaria);
        features.addFeature(skoutari);
        features.addFeature(adelfiko);
        features.addFeature(agEleni);
        features.addFeature(peponia);

        features.addFeature(new Line(serres, provatas));
        features.addFeature(new Line(serres, kKamila));
        features.addFeature(new Line(serres, skoutari));
        features.addFeature(new Line(provatas, aKamila));
        features.addFeature(new Line(kMitrousi, aKamila));
        features.addFeature(new Line(kMitrousi, koumaria));
        features.addFeature(new Line(kMitrousi, kKamila));
        features.addFeature(new Line(skoutari, kKamila));
        features.addFeature(new Line(skoutari, peponia));
        features.addFeature(new Line(skoutari, agEleni));
        features.addFeature(new Line(aKamila, koumaria));
        features.addFeature(new Line(kKamila, koumaria));
        features.addFeature(new Line(koumaria, adelfiko));
        features.addFeature(new Line(peponia, adelfiko));
        features.addFeature(new Line(peponia, agEleni));

        return ResponseEntity.ok(features.asGeoJson());
    }
}
