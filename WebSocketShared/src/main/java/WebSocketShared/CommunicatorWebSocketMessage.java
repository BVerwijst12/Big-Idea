package WebSocketShared;

public class CommunicatorWebSocketMessage {

    private CommunicatorWebSocketMessageOperation operation;

    // Content
    private String content;

    public CommunicatorWebSocketMessageOperation getOperation() {
        return operation;
    }

    public void setOperation(CommunicatorWebSocketMessageOperation operation) {
        this.operation = operation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
