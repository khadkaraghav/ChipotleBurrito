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

        /*ArrayList<Boolean> cheeseSelection = new ArrayList<Boolean>();

        cheeseSelection.add(true);

        ArrayList<Boolean> guacSelection = new ArrayList<Boolean>();

        guacSelection.add(true);

        ArrayList<Boolean> quesoSelection = new ArrayList<Boolean>();

        quesoSelection.add(true);

        ArrayList<Boolean> sourCreamSelection = new ArrayList<Boolean>();

        sourCreamSelection.add(true);*/





        for (int i =1;i<=25;i++)

        {
            Collections.shuffle(riceSelection);
            Collections.shuffle(meatSelection);
            Collections.shuffle(beanSelection);
            Collections.shuffle(salsaSelection);
            Collections.shuffle(veggiesSelection);
           /* Collections.shuffle(cheeseSelection);
            Collections.shuffle(guacSelection);
            Collections.shuffle(quesoSelection);
            Collections.shuffle(sourCreamSelection);*/



            String riceItem = riceSelection.get(0);
            String meatItem = meatSelection.get(0);
            String beanItem = beanSelection.get(0);
            String salsaItem = salsaSelection.get(0);
            String veggiesItem = veggiesSelection.get(0);
           /* boolean cheeseAdd = cheeseSelection.get(0);
            boolean guacAdd = guacSelection.get(0);
            boolean quesoAdd = quesoSelection.get(0);
            boolean sourCreamAdd = sourCreamSelection.get(0);*/




            System.out.println("Burrito "+i+" : "+riceItem+" , "+meatItem+" , "+beanItem+" , "+salsaItem+" , "+veggiesItem+);
        }




    }







}





