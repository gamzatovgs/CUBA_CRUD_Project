package com.company.test.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Car;

@UiController("test_Car.edit")
@UiDescriptor("car-edit.xml")
@EditedEntityContainer("carDc")
@LoadDataBeforeShow
public class CarEdit extends StandardEditor<Car> {
}