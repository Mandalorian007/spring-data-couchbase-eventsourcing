package com.mcf7.spring.data.eventsourcing.template;

import com.mcf7.spring.data.eventsourcing.aggregate.AggregateUpdater;
import com.mcf7.spring.data.eventsourcing.event.CouchbaseDomainEvent;
import com.mcf7.spring.data.eventsourcing.event.EventValidationHandler;

public abstract class CouchbaseEventSourcingTemplate<T extends CouchbaseDomainEvent> extends EventSourcingTemplate<T> {
    public CouchbaseEventSourcingTemplate(EventValidationHandler eventValidationHandler, AggregateUpdater aggregateUpdater) {
        super(eventValidationHandler, aggregateUpdater);
    }
}
