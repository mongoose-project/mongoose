// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.client.navigationarrows.java {

    // Direct dependencies modules
    requires webfx.framework.client.uirouter;
    requires webfx.framework.shared.router;

    // Exported packages
    exports mongoose.client.navigationarrows;

    // Provided services
    provides dev.webfx.framework.client.operations.route.RouteRequestEmitter with mongoose.client.navigationarrows.RouteBackwardRequestEmitter, mongoose.client.navigationarrows.RouteForwardRequestEmitter;

}