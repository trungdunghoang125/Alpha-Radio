package com.trungdunghoang125.alpharadio.data.repository;


import com.trungdunghoang125.alpharadio.data.domain.Country;
import com.trungdunghoang125.alpharadio.data.domain.Language;
import com.trungdunghoang125.alpharadio.data.model.RadioStation;

import java.util.List;

/**
 * Created by trungdunghoang125 on 11/8/2022.
 */
public interface RadioRepository {

    interface LoadCountriesCallback {
        void onCountriesLoad(List<Country> countries);

        void onDataLoadFailed();

        void onError();
    }

    void getCountries(LoadCountriesCallback callback);

    void saveCountries(List<Country> countries);

    interface LoadLanguagesCallback {
        void onLanguagesLoad(List<Language> languages);

        void onDataLoadFailed();

        void onError();
    }

    void getLanguages(LoadLanguagesCallback callback);

    void saveLanguages(List<Language> languages);

    interface LoadStationsCallback {
        void onStationsLoad(List<RadioStation> stations);

        void onDataLoadFailed();

        void onError();
    }

    void getStations(LoadStationsCallback callback, String countryCode);

    void getStationsByLanguage(LoadStationsCallback callback, String language);

    void getSearchStationsResult(LoadStationsCallback callback, String name);

    void getPopStation(LoadStationsCallback callback);

    void saveStations(List<RadioStation> stations);

    void getFavStations(LoadStationsCallback callback);

    void addFavStation(RadioStation station);

    void removeFavStation(RadioStation station);
}
