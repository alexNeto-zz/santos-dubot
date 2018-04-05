package com.admin.tafmetar.model;

import com.admin.tafmetar.enumerate.TargetType;
import com.admin.tafmetar.shared.BusinessException;
import com.admin.tafmetar.view.Observer;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Model implements Subject {

    private List<Observer> observers = new LinkedList<>();
    private static Model uniqueInstance;
    private String locale;

    private Model() {
    }

    public static Model getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Model();
        }
        return uniqueInstance;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(long chatId, String receivedData) {
        for (Observer observer : observers) {
            observer.update(chatId, receivedData);
        }
    }

    public void searchTaf(Update update) {
        List<TargetType> targetTypeList = new ArrayList<>();
        targetTypeList.add(TargetType.TAF);
        sendResponse(update, callTafMetarAerodromeService(targetTypeList));
    }

    public void searchMetar(Update update) {
        List<TargetType> targetTypeList = new ArrayList<>();
        targetTypeList.add(TargetType.METAR);
        sendResponse(update, callTafMetarAerodromeService(targetTypeList));
    }

    public void searchAerodrome(Update update) {
        List<TargetType> targetTypeList = new ArrayList<>();
        targetTypeList.add(TargetType.AERODROME);
        sendResponse(update, callTafMetarAerodromeService(targetTypeList));
    }

    public void searchTafMetarAerodrome(Update update) {
        List<TargetType> targetTypeList = new ArrayList<>();
        targetTypeList.add(TargetType.AERODROME);
        targetTypeList.add(TargetType.TAF);
        targetTypeList.add(TargetType.METAR);
        sendResponse(update, callTafMetarAerodromeService(targetTypeList));
    }

    public String callTafMetarAerodromeService(List<TargetType> targetTypeList) {
        String response;
        try {
            TafMetarAerodromeService tma = new TafMetarAerodromeService(this.locale);
            tma.setTargetList(targetTypeList);
            response = tma.getResponse().toString();
        } catch (BusinessException e) {
            response = e.getMessage();
        }
        return response;
    }

    public void sendResponse(Update update, String message) {
        if (update != null) {
            if (update.callbackQuery() != null) {
                this.notifyObservers(update.callbackQuery().message().chat().id(), message);
            } else if (update.message() != null) {
                this.notifyObservers(update.message().chat().id(), message);
            } else {
                // não deveria chegar
            }
        } else {
            // se chegou aqui, tá tudo errado
        }
    }

    public void setLocale(String locale) {
        this.locale = locale;
        System.out.println(this.locale);
    }
}

