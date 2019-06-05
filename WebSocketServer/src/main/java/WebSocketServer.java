import javax.websocket.server.ServerContainer;

import EndPoints.BattleEndPoint;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer;


public class WebSocketServer {
    private static final int PORT = 8095;

    public static void main(String[] args) {
        startWebSocketServer();
    }

    private static void startWebSocketServer() {
        Server webSocketServer = new Server();
        ServerConnector connector = new ServerConnector(webSocketServer);
        connector.setPort(PORT);
        webSocketServer.addConnector(connector);

        ServletContextHandler webSocketContext = new ServletContextHandler(
                ServletContextHandler.SESSIONS);
        webSocketContext.setContextPath("/");
        webSocketServer.setHandler(webSocketContext);

        try {
            ServerContainer serverContainer = WebSocketServerContainerInitializer
                    .configureContext(webSocketContext);

            serverContainer.addEndpoint(BattleEndPoint.class);

            webSocketServer.start();

            webSocketServer.join();

        } catch (Throwable t) {
            return;
        }
    }
}
