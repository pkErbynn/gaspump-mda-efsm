package edu.iit.architecture.mda.OutputProcessor.Strategy.SetInitialValues;

import edu.iit.architecture.mda.DataStore.DataStore;

public abstract class SetInitialValues {
    DataStore dataStore;

     public SetInitialValues(DataStore dataStore){
         this.dataStore = dataStore;
     }

     public abstract void setInitialValues();
}
