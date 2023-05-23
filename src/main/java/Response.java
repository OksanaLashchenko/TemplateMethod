public class Response {

    private final String responseCode;
    private final String status;

    public Response(String responseCode, String status) {
        this.responseCode = responseCode;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "responseCode='" + responseCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
