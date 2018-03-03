package com.admin.tafmetar.view;

import com.admin.tafmetar.controller.AerodromeController;
import com.admin.tafmetar.controller.ControllerInterface;
import com.admin.tafmetar.model.Model;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;

import java.util.List;

public class View implements Observer, Info {

    private TelegramBot bot = new TelegramBot(token);
    private SendResponse sendResponse;
    private BaseResponse baseResponse;

    int queuesIndex = 0;

    ControllerInterface controllerSearch;

    private Model model;

    public View(Model model) {
        this.model = model;
    }

    public void setControllerSearch(ControllerInterface controllerSearch) { //Strategy Pattern
        this.controllerSearch = controllerSearch;
    }

    public void receiveUsersMessages() {

        GetUpdatesResponse updatesResponse;

        while (true) {
            updatesResponse = bot.execute(new GetUpdates().limit(100).offset(queuesIndex));
            List<Update> updates = updatesResponse.updates();
            setControllerSearch(new AerodromeController(model, this));
            //sendResponse = bot.execute(new SendMessage(update.message().chat().id(), "It's alive!"));

            for (Update update : updates) {
                queuesIndex = update.updateId() + 1;
                this.callController(update);
            }
        }
    }

    public void callController(Update update) {
        this.controllerSearch.search(update);
    }

    public void update(long chatId, String studentsData) {
        sendResponse = bot.execute(new SendMessage(chatId, studentsData));
    }

    public void sendTypingMessage(Update update) {
        baseResponse = bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
    }
}