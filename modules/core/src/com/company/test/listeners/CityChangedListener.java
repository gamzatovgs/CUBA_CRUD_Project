package com.company.test.listeners;

import com.company.test.entity.City;
import com.haulmont.cuba.core.TransactionalDataManager;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@Component("test_CityChangedListener")
public class CityChangedListener {
    @Inject
    private TransactionalDataManager txDm;

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void beforeCommit(EntityChangedEvent<City, UUID> event) {
        if (event.getType() == EntityChangedEvent.Type.CREATED || event.getType() == EntityChangedEvent.Type.UPDATED) {
            City city = txDm.load(event.getEntityId()).one();
            if (city.getIsDefault()) {
                List<City> cityList = txDm.load(City.class).query("select e from test_City e where e.isDefault = true").list();
                for (City c : cityList) {
                    if (!c.getId().equals(event.getEntityId().getValue())) {
                        c.setIsDefault(false);
                        txDm.save(c);
                    }
                }
            }
        }
    }
}
