package mongoose.backend.activities.roomsgraphic;

import mongoose.backend.operations.routes.roomsgraphic.RouteToRoomsGraphicRequest;
import dev.webfx.framework.client.activity.impl.elementals.uiroute.UiRouteActivityContext;
import dev.webfx.framework.client.operations.route.RouteRequestEmitter;
import dev.webfx.framework.shared.router.auth.authz.RouteRequest;

/**
 * @author Bruno Salmon
 */
public final class RouteToRoomsGraphicRequestEmitter implements RouteRequestEmitter {

    @Override
    public RouteRequest instantiateRouteRequest(UiRouteActivityContext context) {
        return new RouteToRoomsGraphicRequest(context.getParameter("eventId"), context.getHistory());
    }
}
