package com.admin.tafmetar.controller;

import com.admin.tafmetar.model.Model;
import com.admin.tafmetar.view.View;
import com.pengrad.telegrambot.model.Update;

public class TafController implements ControllerInterface {

    private Model model;
    private View view;

    public TafController(Model model, View view) {
        this.model = model; //connection Controller -> Model
        this.view = view; //connection Controller -> View
    }

    @Override
    public void search(Update update) {
        view.sendTypingMessage(update);
        model.searchTafMetar(update);
    }
}
