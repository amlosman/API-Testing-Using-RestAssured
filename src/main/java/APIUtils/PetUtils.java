package APIUtils;

import Endpoints.EndPoints;
import io.restassured.response.Response;
import utilities.readers.PropertiesReader;

public class PetUtils {
    public static void postPet(Object bodyDate) {
         RestHelper.restPostRequestWithBody(PropertiesReader.getValue("APIBaseURL"), bodyDate, EndPoints.PetEndPoint, 200);
    }
    public static Response getPetById(int petIdValue){
        return RestHelper.restGetWithPathParam(PropertiesReader.getValue("APIBaseURL"),EndPoints.PetByIdEndPoint,petIdValue,"petId",200);
    }
    public static void getPetByStatus(String status){
        RestHelper.restGetWithQueryParam(PropertiesReader.getValue("APIBaseURL"),EndPoints.PetByStatusEndPoint,status,"status",200);
    }


}
