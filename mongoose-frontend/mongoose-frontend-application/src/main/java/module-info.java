// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.frontend.application {

    // Direct dependencies modules
    requires javafx.graphics;
    requires mongoose.client.application;
    requires mongoose.frontend.activities.cart;
    requires mongoose.frontend.activities.contactus;
    requires mongoose.frontend.activities.fees;
    requires mongoose.frontend.activities.options;
    requires mongoose.frontend.activities.payment;
    requires mongoose.frontend.activities.person;
    requires mongoose.frontend.activities.program;
    requires mongoose.frontend.activities.startbooking;
    requires mongoose.frontend.activities.summary;
    requires mongoose.frontend.activities.terms;

    // Exported packages
    exports mongoose.frontend.application;

    // Provided services
    provides javafx.application.Application with mongoose.frontend.application.MongooseFrontendApplication;

}