package Tourists;


import Locations.*;

public class Labayne implements Tourist {

    static int budget = 1000;


    public void visit() {
        System.out.print("Enjoying my travel");
    }

    public void visit(Tondo tondo) {
        System.out.println("My budget is " + getBudget());

        if ( budget >= tondo.airFare  ){
            System.out.println("I will go to tondo" );
            budget -= tondo.airFare;
            checkBudget();
        }else{
            System.out.println("Im broke my budget is not enough" );
            budget = 0;
        }

     

    }

    public void visit(Africa africa) {

        if(budget >africa.airFare){
            System.out.println("It's time por aprika");
            budget -= africa.airFare;
            checkBudget();
        }else{
            System.out.println("Im broke my budget is not enough");
            budget = 0;
        }

        
    }
    public void visit(Hongkong hongkong) {
        if(budget >hongkong.airFare){
            System.out.println("I love hong kong!");
            budget -= hongkong.airFare;
            checkBudget();
        }else{
            System.out.println("Im broke my budget is not enough");
            budget = 0;
        }

        
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Im back palawan!");
            budget -= palawan.airFare;
            checkBudget();
        }else{
            System.out.println("Im broke my budget is not enough");
            budget = 0;
        }

        
    }

    public void visit(Russia russia) {
        if(budget >russia.airFare){
            System.out.println("I will look for vladimir putin!");
            budget -= russia.airFare;
            
            checkBudget();
        }else{
            System.out.println("Im broke my budget is not enough");
            budget = 0;
        }

        
    }

    public void visit(Boracay boracay) {
        if(budget >boracay.airFare){
            System.out.println("Boracay here I go!");
            budget -= boracay.airFare;

            checkBudget();
        }else{
            System.out.println("Im broke my budget is not enough");
            budget = 0;
        }

       
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}