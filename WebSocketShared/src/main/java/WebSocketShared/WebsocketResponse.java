package WebSocketShared;

public class WebsocketResponse {
    private WebsocketMethods Method;
    private String Content;

    public WebsocketResponse(WebsocketMethods method, String content) {
        Method = method;
        Content = content;
    }

    public WebsocketMethods getMethod() {
        return Method;
    }

    public void setMethod(WebsocketMethods method) {
        Method = method;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

}
