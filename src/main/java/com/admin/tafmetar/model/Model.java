package com.admin.tafmetar.model;

import com.admin.tafmetar.enumerate.TargetType;
import com.admin.tafmetar.shared.BusinessException;
import com.admin.tafmetar.view.Observer;
import com.pengrad.telegrambot.model.Update;

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
        String unformatedMessage = callTafMetarAerodromeService(targetTypeList);
        sendResponse(update, replaceBrackets(unformatedMessage));
    }

    public void searchMetar(Update update) {
        List<TargetType> targetTypeList = new ArrayList<>();
        targetTypeList.add(TargetType.METAR);
        String unformatedMessage = callTafMetarAerodromeService(targetTypeList);
        sendResponse(update, replaceBrackets(unformatedMessage));
    }

    public void searchAerodrome(Update update) {
        List<TargetType> targetTypeList = new ArrayList<>();
        targetTypeList.add(TargetType.AERODROME);
        String unformatedMessage = callTafMetarAerodromeService(targetTypeList);
        sendResponse(update, replaceBrackets(unformatedMessage));
    }

    public void searchTafMetarAerodrome(Update update) {
        this.searchTaf(update);
        this.searchMetar(update);
        this.searchAerodrome(update);
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

            }
        }
    }

    public String replaceBrackets(String message) {
        String formatedMessage;
        formatedMessage = message.replace("[", "");
        formatedMessage = formatedMessage.replace("]", "");
        return formatedMessage;
    }

    public void setLocale(String locale) {
        this.locale = locale;
        System.out.println(this.locale);
    }
}

