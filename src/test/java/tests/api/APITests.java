package tests.api;

import APIUtils.PetUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utilities.readers.JsonReader;

public class APITests {
    @Test(description = "Validate can get pet by random")
    public void getPetByRandomId() {
        int petId = (int) (Math.random() * 5) + 1;
        Response response = PetUtils.getPetById(petId);
        String petName = response.jsonPath().getString("name");
        System.out.println("Pet Name: " + petName);
    }

    @Test(description = "Validate can get all pet by status")
    public void getAllPetsByStatus() {
        String status = "available";
        PetUtils.getPetByStatus(status);
    }

    @Test(description = "Validate can post  pet")
    public void createNewPet() {
        JsonReader jsonReader = new JsonReader("src/test/resources/APiTestData.json");
        PetUtils.postPet(jsonReader.jsonObject);
    }

}
