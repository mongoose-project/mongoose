// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.backend.activities.statistics {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires mongoose.backend.bookingdetailspanel;
    requires mongoose.backend.masterslave;
    requires mongoose.backend.operations.document;
    requires mongoose.backend.operations.documentline;
    requires mongoose.backend.operations.generic;
    requires mongoose.client.activity;
    requires mongoose.client.presentationmodel;
    requires mongoose.client.util;
    requires mongoose.shared.entities;
    requires webfx.extras.type;
    requires webfx.extras.visual.base;
    requires webfx.extras.visual.controls.grid;
    requires webfx.framework.client.action;
    requires webfx.framework.client.activity;
    requires webfx.framework.client.operationaction;
    requires webfx.framework.client.orm.domainmodel.activity;
    requires webfx.framework.client.orm.reactive.dql;
    requires webfx.framework.client.orm.reactive.entities;
    requires webfx.framework.client.orm.reactive.visual;
    requires webfx.framework.client.uirouter;
    requires webfx.framework.client.util;
    requires webfx.framework.shared.operation;
    requires webfx.framework.shared.orm.dql;
    requires webfx.framework.shared.orm.entity;
    requires webfx.framework.shared.orm.expression;
    requires webfx.framework.shared.router;
    requires webfx.platform.client.windowhistory;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.backend.activities.statistics;
    exports mongoose.backend.activities.statistics.routing;
    exports mongoose.backend.operations.routes.statistics;

    // Provided services
    provides dev.webfx.framework.client.operations.route.RouteRequestEmitter with mongoose.backend.activities.statistics.RouteToStatisticsRequestEmitter;
    provides dev.webfx.framework.client.ui.uirouter.UiRoute with mongoose.backend.activities.statistics.StatisticsUiRoute;

}