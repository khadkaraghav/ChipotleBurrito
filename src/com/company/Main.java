package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        addItems();

    }

    public static void addItems() {

        ArrayList<String> riceSelection = new ArrayList<String>();

        riceSelection.add("white rice");
        riceSelection.add("brown rice");
        riceSelection.add("no rice");

        ArrayList<String> meatSelection = new ArrayList<String>();

        meatSelection.add("chicken");
        meatSelection.add("steak");
        meatSelection.add("carnidas");
        meatSelection.add("chorizo");
        meatSelection.add("sofritas");
        meatSelection.add("veggies");

        ArrayList<String> beanSelection = new ArrayList<String>();

        beanSelection.add("pinto");
        beanSelection.add("black");
        beanSelection.add("no beans");

        ArrayList<String> salsaSelection = new ArrayList<String>();

        salsaSelection.add("mild");
        salsaSelection.add("medium");
        salsaSelection.add("hot");
        salsaSelection.add("no salsa");
        salsaSelection.add("all salsa");

        ArrayList<String> veggiesSelection = new ArrayList<String>();

        veggiesSelection.add("lettuce");
        veggiesSelection.add("fajitas");
        veggiesSelection.add("veggies");
        veggiesSelection.add("no veggies");
        veggiesSelection.add("all veggies");

        ArrayList<String> cheeseSelection = new ArrayList<String>();

        cheeseSelection.add("add cheese");
        cheeseSelection.add("no cheese");

        ArrayList<String> guacSelection = new ArrayList<String>();

        guacSelection.add("add guac");
        guacSelection.add("no guac");

        ArrayList<String> quesoSelection = new ArrayList<String>();

        quesoSelection.add("add queso");
        quesoSelection.add("no queso");

        ArrayList<String> sourCreamSelection = new ArrayList<String>();

        sourCreamSelection.add("add sourcream");
        sourCreamSelection.add("no sourcream");


        for (int i =1;i<=25;i++)  //loop 25 times

        {
            Collections.shuffle(riceSelection);
            Collections.shuffle(meatSelection);
            Collections.shuffle(beanSelection);
            Collections.shuffle(salsaSelection);
            Collections.shuffle(veggiesSelection);
            Collections.shuffle(cheeseSelection);
            Collections.shuffle(guacSelection);
            Collections.shuffle(quesoSelection);
            Collections.shuffle(sourCreamSelection);


            String riceItem = riceSelection.get(0);
            String meatItem = meatSelection.get(0);
            String beanItem = beanSelection.get(0);
            String salsaItem = salsaSelection.get(0);

            switch (salsaItem) {

                case "all salsa":
                    salsaItem = "mild salsa, medium salsa, hot salsa";
                    break;

                case "no salsa":
                    salsaItem = "no salsa";
                    break;
            }
            String veggiesItem = veggiesSelection.get(0);

            switch (veggiesItem) {

                case "all veggies":
                    veggiesItem = "veggies, fajitas veggies, lettuce";
                    break;

                case "no veggies":
                    veggiesItem ="no veggies";
                    break;
            }
            String cheeseAdd = cheeseSelection.get(0);

            if (cheeseAdd == "add cheese") {
                cheeseAdd = "add cheese";
            } else {
                cheeseAdd ="no cheese";
            }

            String guacAdd = guacSelection.get(0);

            if (guacAdd == "add guac") {
                guacAdd = "add guac";
            } else {
                guacAdd = "no guac";
            }

            String quesoAdd = quesoSelection.get(0);

            if (quesoAdd == "add queso") {
                quesoAdd = "add queso";
            } else {
                quesoAdd = "no queso";
            }
            String sourCreamAdd = sourCreamSelection.get(0);
            if (sourCreamAdd == "add sourcream ") {
                sourCreamAdd = "add sourcream";
            } else {
                sourCreamAdd = "no sourcream";
            }




            System.out.println("Burrito "+i+" : "+riceItem+" , "+meatItem+" , "+beanItem+" , "+salsaItem+" , "+veggiesItem+" , "+cheeseAdd+" , "+guacAdd+" , "+quesoAdd+" , "+sourCreamAdd);
        }




    }







}





