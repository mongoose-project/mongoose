// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.client.authz {

    // Direct dependencies modules
    requires mongoose.client.authn;
    requires webfx.framework.shared.authz;
    requires webfx.framework.shared.orm.datasourcemodelservice;
    requires webfx.framework.shared.orm.domainmodel;
    requires webfx.framework.shared.orm.entity;
    requires webfx.framework.shared.router;
    requires webfx.platform.shared.log;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.client.services.authz;

    // Provided services
    provides dev.webfx.framework.shared.services.authz.spi.AuthorizationServiceProvider with mongoose.client.services.authz.MongooseAuthorizationServiceProvider;

}