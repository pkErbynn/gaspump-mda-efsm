package edu.iit.architecture.mda.OutputProcessor.Strategy.StoreCash;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump2;

public class StoreCash2 extends StoreCash {
    public StoreCash2(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void storeCash() {
        DataStoreGasPump2 d = (DataStoreGasPump2) dataStore;
        d.cash = d.temp_c;
    }
}
