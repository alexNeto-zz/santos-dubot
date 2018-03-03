package com.admin.tafmetar.model;


import com.admin.tafmetar.view.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void notifyObservers(long chatId, String studentsData);

}