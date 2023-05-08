package Tourists;

import Locations.Boracay;
import Locations.Locations;
import Locations.Russia;
import Locations.Tondo;
import Locations.Palawan;
import Locations.Africa;
import Locations.Hongkong;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Hongkong hongkong);

    void visit(Tondo tondo);

    void visit(Palawan palawan);

    void visit(Africa africa);

    void visit(Russia russia);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}