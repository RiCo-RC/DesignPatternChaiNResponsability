public class SergentSupport implements ISupportService {

    public ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ETypeRequest.LEVEL_THREE) {
            request.setConclusion("Sergent solved level three request!");
        }
        else if (next != null) {
            next.handleRequest(request);
        }
    }
}

