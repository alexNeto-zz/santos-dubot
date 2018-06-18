package com.admin.tafmetar;

import com.admin.tafmetar.bancodedados.PopulateAerodromos;
import com.admin.tafmetar.model.Model;
import com.admin.tafmetar.view.View;

public class Main {

    private static Model model;

    public static void main(String[] args) {
        if (new PopulateAerodromos().insertAll()) {
            model = Model.getInstance();
            View view = new View(model);
            model.registerObserver(view); //connection Model -> View
            view.receiveUsersMessages();
            System.out.println("Bot inicializado");
        } else {
            System.out.println("falha ao inserir aerodromos");
        }
    }
}
