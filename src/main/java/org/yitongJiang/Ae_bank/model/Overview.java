package org.yitongJiang.Ae_bank.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Overview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false,unique = true)
    private long Id;

    @JsonProperty("Symbol")
    @Column(name = "symbol",nullable = false,unique = true)
    private String symbol;

    @JsonProperty("AssetType")
    @Column(name = "asset_type",nullable = false)
    private String assetType;

    @JsonProperty("Name")
    @Column(name = "name",nullable = false,unique = true)
    private String name;

    @JsonProperty("Exchange")
    @Column(name = "exchange",nullable = false)
    private String exchange;

    @JsonProperty("Currency")
    @Column(name = "currency",nullable = false)
    private String currency;

    @JsonProperty("Country")
    @Column(name = "country",nullable = false)
    private String country;

    @JsonProperty("Sector")
    @Column(name = "sector",nullable = false)
    private String sector;

    @JsonProperty("Industry")
    @Column(name = "industry",nullable = false)
    private String industry;

    @JsonProperty("MarketCapitalization")
    @Column(name = "market_Cap",nullable = false)
    private long marketCap;
    //"52WeekLow": "111.84",
    @JsonProperty("52WeekLow")
    @Column(name = "year_low",nullable = false)
    private float yearLow;
    //DividendDate": "2022-06-10",
    @JsonProperty("DividendDate")
    @Column(name = "dividend_date",nullable = false)
    private String dividendDate;





    @Override
    public String toString() {
        return "{" +
                "\"Id\":" + Id +
                ", \"symbol\":\"" + symbol + '"' +
                ", \"assetType\":\"" + assetType + '"' +
                ", \"name\":\"" + name + '"' +
                ", \"exchange\":\"" + exchange + '"' +
                ", \"currency\":\"" + currency + '"' +
                ", \"country\":\"" + country + '"' +
                ", \"sector\":\"" + sector + '"' +
                ", \"industry\":\"" + industry + '"' +
                ", \"marketCap\":" + marketCap +
                ", \"yearLow\":" + yearLow +
                ", \"dividendDate\":\"" + dividendDate + '"' +
                '}';
    }
}

