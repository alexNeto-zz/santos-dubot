package com.admin.tafmetar.model;

import com.admin.tafmetar.view.Observer;
import com.pengrad.telegrambot.model.Update;

import java.util.LinkedList;
import java.util.List;

public class Model implements Subject {

    private List<Observer> observers = new LinkedList<>();

    private static Model uniqueInstance;

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
    public void notifyObservers(long chatId, String studentsData) {
        for (Observer observer : observers) {
            observer.update(chatId, studentsData);
        }
    }

    public void searchTafMetar(Update update) {
        String response = null;

        if (response != null) {
            this.notifyObservers(update.message().chat().id(), response);
        } else {
            this.notifyObservers(update.message().chat().id(), "Student not found");
        }

    }
}

