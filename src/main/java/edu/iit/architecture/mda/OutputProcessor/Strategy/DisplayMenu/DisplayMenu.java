package edu.iit.architecture.mda.OutputProcessor.Strategy.DisplayMenu;

import edu.iit.architecture.mda.PlatformData.DataStore;

public abstract class DisplayMenu {
    DataStore datastore;

    public DisplayMenu(DataStore data) {
        this.datastore = data;
    }

    public abstract void displayMenu();
}
