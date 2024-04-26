package edu.iit.architecture.mda.OutputProcessor.Strategy.SetPayType;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump1;

public class SetPayType1 extends SetPayType {
    public SetPayType1(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void setPayType(int t) {
        DataStoreGasPump1 d = (DataStoreGasPump1)dataStore;
        d.w = t;
        System.out.println("Pay Type stored");
    }
}
