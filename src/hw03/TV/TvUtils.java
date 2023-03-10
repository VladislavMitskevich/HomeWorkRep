package hw03.TV;


import hw03.TV.custom_classes.CustomCompare;
import hw03.TV.model.TvModel;

import java.util.Collection;

public class TvUtils {
    public static Collection<TvModel> equalsdiagonal(Collection<TvModel> setTv, int diagonal) {
        CustomCompare cc = new CustomCompare();
        Collection<TvModel> tvCollection = cc.returnCollectionTv(setTv, (TvModel tv1) -> {
            return tv1.getDiagonal() == diagonal;
        });
        return tvCollection;
    }

    public static Collection<TvModel> equalsManufacture(Collection<TvModel> setTv, String man) {
        CustomCompare cc = new CustomCompare();
        Collection<TvModel> tvCollection = cc.returnCollectionTv(setTv, (TvModel tv1) -> {
            return tv1.getManufacturer() == man;
        });
        return tvCollection;
    }

    public static Collection<TvModel> yangerThenThisYear(Collection<TvModel> setTv, int year) {
        CustomCompare cc = new CustomCompare();
        Collection<TvModel> tvCollection = cc.returnCollectionTv(setTv, (TvModel tv1) -> {
            return tv1.getYearOfManufacture() == year;
        });
        return tvCollection;
    }

    public Collection<TvModel> priceRange(Collection<TvModel> setTv, int startPrice, int price2) {
        CustomCompare cc = new CustomCompare();
        Collection<TvModel> tvCollection = cc.returnCollectionTv(setTv, (TvModel tv1) -> {
            return tv1.getPrice() > startPrice && tv1.getPrice() < price2;
        });
        return tvCollection;
    }

}
