package Reflection.Exercise.BarracksWar_ANewFactory_03;


import Reflection.Exercise.BarracksWar_ANewFactory_03.core.Engine;
import Reflection.Exercise.BarracksWar_ANewFactory_03.core.factories.UnitFactoryImpl;
import Reflection.Exercise.BarracksWar_ANewFactory_03.data.UnitRepository;
import Reflection.Exercise.BarracksWar_ANewFactory_03.interfaces.Repository;
import Reflection.Exercise.BarracksWar_ANewFactory_03.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
