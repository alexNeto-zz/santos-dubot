package com.admin.tafmetar.model;


import com.admin.tafmetar.view.Observer;

public interface Subject {

    public void registerObserver(Observer observer);

    public void notifyObservers(long chatId, String studentsData);

}