// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.shared.entities {

    // Direct dependencies modules
    requires java.base;
    requires mongoose.shared.domainmodel;
    requires mongoose.shared.time;
    requires webfx.framework.shared.orm.entity;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.shared.entities;
    exports mongoose.shared.entities.formatters;
    exports mongoose.shared.entities.impl;
    exports mongoose.shared.entities.markers;
    exports mongoose.shared.services.systemmetrics;

    // Provided services
    provides dev.webfx.framework.shared.orm.entity.EntityFactoryProvider with mongoose.shared.entities.impl.AttendanceImpl.ProvidedFactory, mongoose.shared.entities.impl.CartImpl.ProvidedFactory, mongoose.shared.entities.impl.CountryImpl.ProvidedFactory, mongoose.shared.entities.impl.DateInfoImpl.ProvidedFactory, mongoose.shared.entities.impl.DocumentImpl.ProvidedFactory, mongoose.shared.entities.impl.DocumentLineImpl.ProvidedFactory, mongoose.shared.entities.impl.EventImpl.ProvidedFactory, mongoose.shared.entities.impl.FilterImpl.ProvidedFactory, mongoose.shared.entities.impl.GatewayParameterImpl.ProvidedFactory, mongoose.shared.entities.impl.HistoryImpl.ProvidedFactory, mongoose.shared.entities.impl.ImageImpl.ProvidedFactory, mongoose.shared.entities.impl.ItemFamilyImpl.ProvidedFactory, mongoose.shared.entities.impl.ItemImpl.ProvidedFactory, mongoose.shared.entities.impl.LabelImpl.ProvidedFactory, mongoose.shared.entities.impl.MailImpl.ProvidedFactory, mongoose.shared.entities.impl.MethodImpl.ProvidedFactory, mongoose.shared.entities.impl.MoneyTransferImpl.ProvidedFactory, mongoose.shared.entities.impl.OptionImpl.ProvidedFactory, mongoose.shared.entities.impl.OrganizationImpl.ProvidedFactory, mongoose.shared.entities.impl.OrganizationTypeImpl.ProvidedFactory, mongoose.shared.entities.impl.PersonImpl.ProvidedFactory, mongoose.shared.entities.impl.RateImpl.ProvidedFactory, mongoose.shared.entities.impl.SiteImpl.ProvidedFactory, mongoose.shared.entities.impl.SystemMetricsEntityImpl.ProvidedFactory, mongoose.shared.entities.impl.TeacherImpl.ProvidedFactory;

}