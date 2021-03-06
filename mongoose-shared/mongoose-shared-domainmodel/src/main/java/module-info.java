// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.shared.domainmodel {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires webfx.extras.type;
    requires webfx.framework.shared.orm.datasourcemodelservice;
    requires webfx.framework.shared.orm.domainmodel;
    requires webfx.framework.shared.orm.domainmodelservice;
    requires webfx.framework.shared.orm.dql;
    requires webfx.framework.shared.orm.entity;
    requires webfx.framework.shared.orm.expression;
    requires webfx.platform.shared.json;
    requires webfx.platform.shared.query;
    requires webfx.platform.shared.resource;
    requires webfx.platform.shared.serial;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.shared.domainmodel.formatters;
    exports mongoose.shared.domainmodel.functions;
    exports mongoose.shared.services.datasourcemodel;
    exports mongoose.shared.services.domainmodel;

    // Resources packages
    opens mongoose.shared.domainmodel;

    // Provided services
    provides dev.webfx.framework.shared.services.datasourcemodel.spi.DataSourceModelProvider with mongoose.shared.services.datasourcemodel.MongooseDataSourceModelProvider;
    provides dev.webfx.framework.shared.services.domainmodel.spi.DomainModelProvider with mongoose.shared.services.domainmodel.MongooseDomainModelProvider;

}