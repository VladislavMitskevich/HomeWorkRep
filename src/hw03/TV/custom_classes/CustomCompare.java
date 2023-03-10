package hw03.TV.custom_classes;

import hw03.TV.model.TvModel;

import java.util.ArrayList;
import java.util.Collection;

public class CustomCompare {
    public static Collection<TvModel> returnCollectionTv(Collection<TvModel> tv, CompareForTv cft) {
        Collection<TvModel> list = new ArrayList<>();
        for (TvModel name : tv) {
            if (cft.isEquals(name)) {
                list.add(name);
            }
        }
        return list;
    }
}
