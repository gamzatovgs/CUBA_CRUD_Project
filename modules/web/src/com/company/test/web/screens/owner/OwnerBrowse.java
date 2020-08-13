package com.company.test.web.screens.owner;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Owner;

@UiController("test_Owner.browse")
@UiDescriptor("owner-browse.xml")
@LookupComponent("ownersTable")
@LoadDataBeforeShow
public class OwnerBrowse extends StandardLookup<Owner> {
}