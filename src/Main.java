public class Main {
    public static void main(String[] args) {
        ISupportService general = new GeneralSupport();
        ISupportService sergent = new SergentSupport();
        ISupportService caporal = new CaporalSupport();
        ISupportService soldat = new SoldatSupport();

        general.setNext(sergent);
        sergent.setNext(caporal);
        caporal.setNext(soldat);

        ServiceRequest requestLevelOne = new ServiceRequest(ETypeRequest.LEVEL_ONE, "faut réaliser le ménage de la caserne");
        ServiceRequest requestLevelTwo = new ServiceRequest(ETypeRequest.LEVEL_TWO, "faut faire visiter la caserne aux nouveaux arrivant");
        ServiceRequest requestLevelThree = new ServiceRequest(ETypeRequest.LEVEL_THREE, "faut entrainer les nouveaux arrivant");
        ServiceRequest requestLevelFour = new ServiceRequest(ETypeRequest.LEVEL_FOUR, "faut preprarer une mission militaire");
        ServiceRequest requestOther = new ServiceRequest(ETypeRequest.OTHER, "faut préparer 1000 euro");

        general.handleRequest(requestLevelOne);
        general.handleRequest(requestLevelTwo);
        general.handleRequest(requestLevelThree);
        general.handleRequest(requestLevelFour);
        general.handleRequest(requestOther);

        requestLevelOne.display(true);
        requestLevelTwo.display(true);
        requestLevelThree.display(true);
        requestLevelFour.display(true);
        requestOther.display(true);
    }
}