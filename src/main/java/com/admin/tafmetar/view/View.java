package com.admin.tafmetar.view;

import com.admin.tafmetar.controller.AerodromeController;
import com.admin.tafmetar.controller.ControllerInterface;
import com.admin.tafmetar.controller.TafController;
import com.admin.tafmetar.enumerate.TargetType;
import com.admin.tafmetar.model.Model;
import com.pengrad.telegrambot.Callback;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.request.*;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.List;

public class View implements Observer, Info {

    private TelegramBot bot = new TelegramBot(token);
    private GetUpdatesResponse updatesResponse;
    private Integer offSet = 0;

    int queuesIndex = 0;

    ControllerInterface controllerSearch;

    private Model model;

    public View(Model model) {
        this.model = model;
    }

    public void receiveUsersMessages() {

        bot.setUpdatesListener(arg0 -> {
            try {
                processConversation();
            } catch (Exception e) {
                System.out.println("Erro: " + e);
            }
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    public void processConversation() {

        updatesResponse = bot.execute(new GetUpdates().limit(100).offset(offSet));
        List<Update> updates = updatesResponse.updates();


        InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup(
                new InlineKeyboardButton[]{
                        new InlineKeyboardButton("Aerodromo").callbackData("callback_aerodrome"),
                        new InlineKeyboardButton("Taf").callbackData("callback_taf"),
                        new InlineKeyboardButton("Metar").callbackData("callback_metar"),
                        new InlineKeyboardButton("Todos").callbackData("callback_all")
                });

        for (Update update : updates) {
            queuesIndex = update.updateId() + 1;
            if (update.callbackQuery() != null) {
                if (update.callbackQuery().data() == "callback_aerodrome") {
                    setControllerSearch(new AerodromeController(model, this));
                }
                if (update.callbackQuery().data() == "callback_taf") {
                    setControllerSearch(new TafController(model, this));
                }
                if (update.callbackQuery().data() == "callback_metar") {

                }
                if (update.callbackQuery().data() == "callback_all") {

                }
//                System.out.println(update.callbackQuery().data());
//                bot.execute(new SendMessage(update.callbackQuery().message().chat().id(),
//                        update.callbackQuery().message().text()));
            }
            if (update.message() == null || StringUtils.isEmpty(update.message().text())) {
                continue;
            }
            if (update.message().text().toLowerCase().startsWith("sb")) {
                bot.execute(new SendMessage(update.message().chat().id(), "Inserindo keyboard inline")
                        .replyMarkup(inlineKeyboard));
            }

//            this.callController(update);
        }
    }


    public void callController(Update update) {
        // bot.execute(new SendMessage(update.message().chat().id(), "It's alive!"));
        this.controllerSearch.search(update);
    }

    public void update(long chatId, String studentsData) {
        bot.execute(new SendMessage(chatId, studentsData));
    }

    public void setControllerSearch(ControllerInterface controllerSearch) { //Strategy Pattern
        this.controllerSearch = controllerSearch;
    }

    public void sendTypingMessage(Update update) {
        bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
    }
}