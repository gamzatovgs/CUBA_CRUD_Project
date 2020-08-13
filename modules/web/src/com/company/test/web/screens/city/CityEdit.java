package com.company.test.web.screens.city;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.City;

@UiController("test_City.edit")
@UiDescriptor("city-edit.xml")
@EditedEntityContainer("cityDc")
@LoadDataBeforeShow
public class CityEdit extends StandardEditor<City> {
}