// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.client.aggregates {

    // Direct dependencies modules
    requires java.base;
    requires mongoose.shared.entities;
    requires webfx.framework.shared.orm.domainmodel;
    requires webfx.framework.shared.orm.entity;
    requires webfx.platform.client.websocketbus;
    requires webfx.platform.shared.bus;
    requires webfx.platform.shared.log;
    requires webfx.platform.shared.query;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.client.aggregates.cart;
    exports mongoose.client.aggregates.event;
    exports mongoose.client.aggregates.person;

}