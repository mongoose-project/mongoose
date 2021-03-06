// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.frontend.activities.terms {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires mongoose.client.bookingprocess;
    requires mongoose.client.icons;
    requires mongoose.client.sectionpanel;
    requires mongoose.client.util;
    requires webfx.extras.visual.base;
    requires webfx.extras.visual.controls.grid.peers.base;
    requires webfx.framework.client.activity;
    requires webfx.framework.client.i18n;
    requires webfx.framework.client.orm.domainmodel.activity;
    requires webfx.framework.client.orm.reactive.visual;
    requires webfx.framework.client.uirouter;
    requires webfx.framework.client.util;
    requires webfx.framework.shared.orm.dql;
    requires webfx.platform.client.windowhistory;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.frontend.activities.terms;
    exports mongoose.frontend.activities.terms.routing;
    exports mongoose.frontend.operations.terms;

    // Provided services
    provides dev.webfx.framework.client.ui.uirouter.UiRoute with mongoose.frontend.activities.terms.TermsUiRoute;

}