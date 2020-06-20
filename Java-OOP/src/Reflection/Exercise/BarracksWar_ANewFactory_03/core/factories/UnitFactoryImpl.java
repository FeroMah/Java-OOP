package Reflection.Exercise.BarracksWar_ANewFactory_03.core.factories;


import Reflection.Exercise.BarracksWar_ANewFactory_03.interfaces.Unit;
import Reflection.Exercise.BarracksWar_ANewFactory_03.interfaces.UnitFactory;
import Reflection.Exercise.BarracksWar_ANewFactory_03.models.units.*;
import jdk.jshell.spi.ExecutionControl;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
        // TODO: implement for problem 3
        Unit unit;
        switch (unitType) {
            case "Archer":
                unit = new Archer();
                break;
            case "Pikeman":
                unit = new Pikeman();
                break;
            case "Swordsman":
                unit = new Swordsman();
                break;
            case "Horseman":
                unit = new Horseman();
                break;
            case "Gunner":
                unit = new Gunner();
                break;
            default:
                throw new ExecutionControl.NotImplementedException("message");
        }
        return unit;
    }
}
