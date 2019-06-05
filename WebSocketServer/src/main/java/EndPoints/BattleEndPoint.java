package EndPoints;

import WebSocketShared.CommunicatorWebSocketMessage;
import WebSocketShared.CommunicatorWebSocketMessageOperation;
import WebSocketShared.WebsocketResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import static WebSocketShared.CommunicatorWebSocketMessageOperation.BATTLE;

@ServerEndpoint(value = "/battle/")
public class BattleEndPoint {
    private static final List<Session> sessions = new ArrayList<>();

    @OnOpen
    public void onConnect(Session session) {

        sessions.add(session);
    }

    @OnMessage
    public void onText(String message, Session session) {
        handleMessageFromClient(message, session);
    }

    @OnClose
    public void onClose(CloseReason reason, Session session) {
        sessions.remove(session);
    }

    @OnError
    public void onError(Throwable cause, Session session) {
    }

    private void handleMessageFromClient(String jsonMessage, Session session) {
        Gson gson = new Gson();
        CommunicatorWebSocketMessage wsMessage = null;

        try {
            wsMessage = gson.fromJson(jsonMessage, CommunicatorWebSocketMessage.class);

        } catch (JsonSyntaxException ex) {
            System.out.println(ex.getMessage());
        }

        CommunicatorWebSocketMessageOperation operation = wsMessage.getOperation();

        if (operation != null){
            switch (operation){
                case BATTLE:
                    WebsocketResponse response = gson.fromJson(wsMessage.getContent(), WebsocketResponse.class);

                    switch (response.getMethod()){
                        case SWITCHPOKEMON:
                            // do stuff
                        case ATTACK:
                            // do attack
                    }
            }
        }
    }
}
