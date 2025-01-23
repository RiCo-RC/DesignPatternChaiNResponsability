public interface ISupportService {
    public void setNext(ISupportService next);
    public void handleRequest(ServiceRequest request);
}
