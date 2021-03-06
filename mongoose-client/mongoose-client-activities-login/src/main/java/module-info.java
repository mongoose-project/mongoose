// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.client.activities.login {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires mongoose.client.activity;
    requires mongoose.client.sectionpanel;
    requires mongoose.client.validation;
    requires webfx.framework.client.activity;
    requires webfx.framework.client.controls;
    requires webfx.framework.client.i18n;
    requires webfx.framework.client.orm.domainmodel.activity;
    requires webfx.framework.client.uirouter;
    requires webfx.framework.client.util;
    requires webfx.framework.shared.authn;
    requires webfx.kit.util;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.client.activities.login;

    // Provided services
    provides dev.webfx.framework.client.ui.uirouter.UiRoute with mongoose.client.activities.login.LoginUiRoute;

}