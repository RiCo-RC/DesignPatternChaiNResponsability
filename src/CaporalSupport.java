public class CaporalSupport implements ISupportService {

    public ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ETypeRequest.LEVEL_TWO) {
            request.setConclusion("Caporal solved level two request!");
        }
        else if (next != null) {
            next.handleRequest(request);
        }
    }
}


