package com.admin.tafmetar;

import com.admin.tafmetar.model.Model;
import com.admin.tafmetar.view.View;

public class Main {

    private static Model model;

    public static void main(String[] args) {

        model = Model.getInstance();
        //initializeModel(model);
        View view = new View(model);
        model.registerObserver(view); //connection Model -> View
        view.receiveUsersMessages();

    }
}
