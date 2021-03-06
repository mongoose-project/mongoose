// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.backend.application {

    // Direct dependencies modules
    requires javafx.graphics;
    requires mongoose.backend.activities.authorizations;
    requires mongoose.backend.activities.bookings;
    requires mongoose.backend.activities.cloneevent;
    requires mongoose.backend.activities.diningareas;
    requires mongoose.backend.activities.events;
    requires mongoose.backend.activities.income;
    requires mongoose.backend.activities.letter;
    requires mongoose.backend.activities.letters;
    requires mongoose.backend.activities.monitor;
    requires mongoose.backend.activities.operations;
    requires mongoose.backend.activities.organizations;
    requires mongoose.backend.activities.payments;
    requires mongoose.backend.activities.roomsgraphic;
    requires mongoose.backend.activities.statements;
    requires mongoose.backend.activities.statistics;
    requires mongoose.backend.activities.users;
    requires mongoose.backend.bookingdetailspanel;
    requires mongoose.backend.masterslave;
    requires mongoose.client.application;

    // Exported packages
    exports mongoose.backend.application;

    // Provided services
    provides javafx.application.Application with mongoose.backend.application.MongooseBackendApplication;

}