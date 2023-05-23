public abstract class AbstractEntity {

    void updateInformation(String information) {
        System.out.println(getObject());
        if (!processValidation()) {
            generateResponse("406", "Not authorised");
            return;
        }
        if (!saveInformationRequest(information)) {
            generateResponse("500", "Information did not updated");
            return;
        }
        generateResponse("200", "OK");
        addSomeLogic();
    }

    abstract Object getObject();

    abstract boolean processValidation();

    abstract boolean saveInformationRequest(String information);

    void generateResponse(String responseCode, String status) {
        Response response = new Response(responseCode, status);
        System.out.println(response.toString());
    }

    void addSomeLogic() {
    }

}
