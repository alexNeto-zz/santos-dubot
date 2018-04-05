package com.admin.tafmetar.controller;

import com.admin.tafmetar.model.Model;
import com.admin.tafmetar.view.View;
import com.pengrad.telegrambot.model.Update;

public class AerodromeController implements ControllerInterface {

    private Model model;
    private View view;

    public AerodromeController(Model model, View view){
        this.model = model;
        this.view = view;
    }

    @Override
    public void search(Update update){
        view.sendTypingMessage(update);
        model.searchAerodrome(update);
    }
}
