package edu.iit.architecture.mda.OutputProcessor.Strategy.PumpGasUnit;

import edu.iit.architecture.mda.PlatformData.DataStore;

public abstract class PumpGasUnit {
    DataStore dataStore;

    public PumpGasUnit(DataStore dataStore){
        this.dataStore = dataStore;
    }

    public abstract void pumpGasUnit();
}
