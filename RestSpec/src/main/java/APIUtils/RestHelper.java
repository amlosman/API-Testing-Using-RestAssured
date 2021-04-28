package APIUtils;

import Endpoints.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestHelper {
    public static void restPostRequestWithBody(String baseURL, Object requestBody, EndPoints endPoint, int status){
        RestAssured.given()
                .body(requestBody)
                .contentType(ContentType.JSON)
                .when().post(baseURL.concat(endPoint.value))
                .then().assertThat().statusCode(status).
                log().all();

    }
    public static Response restGetWithPathParam(String baseURL, EndPoints endPoint,int pathParamValue,String pathKey, int status){
        Response response= RestAssured.given()
                .log().all()
                .pathParam(pathKey, pathParamValue)
                .when()
                .get(baseURL.concat(endPoint.value));
                response.then().assertThat().statusCode(status).log().all();
        return response;
    }
    public static void restGetWithQueryParam(String baseURL, EndPoints endPoint,String qParamValue,String qKey, int status){
         RestAssured.given()
                .log().all()
                .queryParam(qKey, qParamValue)
                .when()
                .get(baseURL.concat(endPoint.value))
                .then().assertThat().statusCode(status)
                 .log().all();
    }
}
