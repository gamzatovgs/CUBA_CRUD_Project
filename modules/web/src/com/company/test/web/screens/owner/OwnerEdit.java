package com.company.test.web.screens.owner;

import com.company.test.entity.Car;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Owner;

import javax.inject.Inject;

@UiController("test_Owner.edit")
@UiDescriptor("owner-edit.xml")
@EditedEntityContainer("ownerDc")
public class OwnerEdit extends StandardEditor<Owner> {

    @Inject
    private CollectionLoader<Car> carsDl;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        carsDl.setParameter("owner", getEditedEntity());
        getScreenData().loadAll();
    }
}