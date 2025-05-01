package com.rportillop.conversordemoneda.principal;

import com.rportillop.conversordemoneda.modelos.ConversionHistory;
import com.rportillop.conversordemoneda.modelos.CurrencyConverter;
import com.rportillop.conversordemoneda.services.ExchangeRateApiClient;

public class Main {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/75d18a30809466b490f40096/latest/USD";

    public static void main(String[] args) {
        ExchangeRateApiClient apiClient = new ExchangeRateApiClient(API_URL);
        CurrencyConverter converter = new CurrencyConverter();
        ConversionHistory historyManager = new ConversionHistory();

        Menu menu = new Menu(apiClient, converter, historyManager);
        menu.display();
    }
}