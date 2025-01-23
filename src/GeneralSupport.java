public class GeneralSupport implements ISupportService {

    public ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ETypeRequest.LEVEL_FOUR) {
            request.setConclusion("General solved level four request!");
        }
        else if (request.getType() == ETypeRequest.OTHER) {
            request.setConclusion("Your request could not be handled at this time!");
        }
        else if (next != null) {
            next.handleRequest(request);
        }
    }
}
