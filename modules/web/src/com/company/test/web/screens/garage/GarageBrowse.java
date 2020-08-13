package com.company.test.web.screens.garage;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Garage;

@UiController("test_Garage.browse")
@UiDescriptor("garage-browse.xml")
@LookupComponent("garagesTable")
@LoadDataBeforeShow
public class GarageBrowse extends StandardLookup<Garage> {
}