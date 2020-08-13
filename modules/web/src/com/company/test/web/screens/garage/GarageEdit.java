package com.company.test.web.screens.garage;

import com.company.test.entity.Car;
import com.company.test.entity.City;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Garage;

import javax.inject.Inject;

@UiController("test_Garage.edit")
@UiDescriptor("garage-edit.xml")
@EditedEntityContainer("garageDc")
public class  GarageEdit extends StandardEditor<Garage> {
    @Inject
    private DataManager dataManager;

    @Inject
    private CollectionLoader<Car> carsDl;

    @Subscribe
     protected void onInitEntity(InitEntityEvent<Garage> event) {
        try {
            event.getEntity().setCity(dataManager.load(City.class).query("select e from test_City e where e.isDefault = true").one());
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
     }

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        carsDl.setParameter("garage", getEditedEntity());
        getScreenData().loadAll();
    }
}