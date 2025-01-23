public class SoldatSupport implements ISupportService {

    public ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ETypeRequest.LEVEL_ONE) {
            request.setConclusion("Soldat solved level one request!");
        }
        else if (next != null) {
            next.handleRequest(request);
        }
    }
}



