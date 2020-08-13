package com.company.test.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Car;

@UiController("test_Car.browse")
@UiDescriptor("car-browse.xml")
@LookupComponent("carsTable")
@LoadDataBeforeShow
public class CarBrowse extends StandardLookup<Car> {
}