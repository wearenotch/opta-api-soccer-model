package com.ag04.opta.soccer.sdapi;

import java.io.Serializable;

public class OptaCountryDto implements Serializable {
    String countryId;
    String country;
    String countryCode;

    public OptaCountryDto() {
        //
    }

    public OptaCountryDto(String countryId, String country, String countryCode) {
        this.countryId = countryId;
        this.country = country;
        this.countryCode = countryCode;
    }

    // --- set / get methods --------------------------------------------------

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Country{" +
            "countryId=" + countryId +
            ", country='" + country + "'" +
            ", countryCode='" + countryCode + "'" +
        "}";
    }
}
