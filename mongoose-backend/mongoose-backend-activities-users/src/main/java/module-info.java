// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.backend.activities.users {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.graphics;
    requires mongoose.backend.masterslave;
    requires mongoose.client.activity;
    requires mongoose.shared.domainmodel;
    requires mongoose.shared.entities;
    requires webfx.extras.visual.base;
    requires webfx.framework.client.activity;
    requires webfx.framework.client.orm.domainmodel.activity;
    requires webfx.framework.client.orm.reactive.dql;
    requires webfx.framework.client.orm.reactive.visual;
    requires webfx.framework.client.uirouter;
    requires webfx.framework.shared.operation;
    requires webfx.framework.shared.orm.dql;
    requires webfx.framework.shared.orm.expression;
    requires webfx.framework.shared.router;
    requires webfx.platform.client.windowhistory;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.backend.activities.users;
    exports mongoose.backend.activities.users.routing;
    exports mongoose.backend.operations.routes.users;

    // Provided services
    provides dev.webfx.framework.client.operations.route.RouteRequestEmitter with mongoose.backend.activities.users.RouteToUsersRequestEmitter;
    provides dev.webfx.framework.client.ui.uirouter.UiRoute with mongoose.backend.activities.users.UsersUiRoute;

}