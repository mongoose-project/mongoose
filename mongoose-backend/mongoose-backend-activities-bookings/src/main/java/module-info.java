// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.backend.activities.bookings {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires mongoose.backend.activities.cloneevent.routing;
    requires mongoose.backend.bookingdetailspanel;
    requires mongoose.backend.masterslave;
    requires mongoose.backend.operations.document;
    requires mongoose.backend.operations.generic;
    requires mongoose.client.activity;
    requires mongoose.client.aggregates;
    requires mongoose.client.presentationmodel;
    requires mongoose.client.util;
    requires mongoose.frontend.activities.fees;
    requires mongoose.shared.domainmodel;
    requires mongoose.shared.entities;
    requires webfx.extras.visual.base;
    requires webfx.extras.visual.controls.grid;
    requires webfx.framework.client.action;
    requires webfx.framework.client.activity;
    requires webfx.framework.client.operationaction;
    requires webfx.framework.client.orm.domainmodel.activity;
    requires webfx.framework.client.orm.reactive.dql;
    requires webfx.framework.client.orm.reactive.visual;
    requires webfx.framework.client.uirouter;
    requires webfx.framework.client.util;
    requires webfx.framework.shared.operation;
    requires webfx.framework.shared.orm.dql;
    requires webfx.framework.shared.orm.expression;
    requires webfx.framework.shared.router;
    requires webfx.platform.client.windowhistory;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.backend.activities.bookings;
    exports mongoose.backend.activities.bookings.routing;
    exports mongoose.backend.operations.routes.bookings;

    // Provided services
    provides dev.webfx.framework.client.operations.route.RouteRequestEmitter with mongoose.backend.activities.bookings.RouteToBookingsRequestEmitter;
    provides dev.webfx.framework.client.ui.uirouter.UiRoute with mongoose.backend.activities.bookings.BookingsUiRoute;

}