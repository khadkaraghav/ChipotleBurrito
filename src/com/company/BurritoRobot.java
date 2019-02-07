package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class BurritoRobot {

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

        salsaSelection.add("mild salsa");
        salsaSelection.add("medium salsa");
        salsaSelection.add("hot salsa");
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

            double totalPrice=3;

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

            if (riceItem=="no rice") {
                totalPrice += 0;
            }

            else
            {
                totalPrice+=0.5;
            }

            String meatItem = meatSelection.get(0);
            totalPrice+=0.5;

            String beanItem = beanSelection.get(0);

            if (beanItem=="no beans") {
                totalPrice += 0;
            }

            else
            {
                totalPrice+=0.5;
            }

            String salsaItem = salsaSelection.get(0);

            if (salsaItem=="all salsa") {
                salsaItem = "mild salsa, medium salsa, hot salsa";
                totalPrice += 1.5;
            }
            else {
                salsaItem = "no salsa";


                totalPrice+=0;
            }

            String veggiesItem = veggiesSelection.get(0);

            if (veggiesItem=="all veggies") {
                veggiesItem = "veggies, fajitas veggies, lettuce";
                totalPrice += 1.5;
            }

            else {
                veggiesItem ="no veggies";
                totalPrice+=0;

            }

            String cheeseAdd = cheeseSelection.get(0);

            if (cheeseAdd == "add cheese")
            {
                cheeseAdd = "add cheese";
                totalPrice+=0.5;
            }
            else
            {
                cheeseAdd ="no cheese";
                totalPrice+=0;
            }

            String guacAdd = guacSelection.get(0);

            if (guacAdd == "add guac")
            {
                guacAdd = "add guac";
                totalPrice+=0.5;
            }
            else
            {
                guacAdd = "no guac";
                totalPrice+=0;
            }

            String quesoAdd = quesoSelection.get(0);

            if (quesoAdd == "add queso")
            {
                quesoAdd = "add queso";
                totalPrice+=0.5;
            }
            else
            {
                quesoAdd = "no queso";
                totalPrice+=0;
            }

            String sourCreamAdd = sourCreamSelection.get(0);

            if (sourCreamAdd == "add sourcream")
            {
                sourCreamAdd = "add sourcream";
                totalPrice+=0.5;
            }

            else
            {
                sourCreamAdd = "no sourcream";
                totalPrice+=0;
            }


            System.out.println("Burrito "+i+" : "+riceItem+" , "+meatItem+" , "+beanItem+" , "+salsaItem+" , "+veggiesItem+" , "+cheeseAdd+" , "+guacAdd+" , "+quesoAdd+" , "+sourCreamAdd+" ------- $"+totalPrice);

        }
    }
}




