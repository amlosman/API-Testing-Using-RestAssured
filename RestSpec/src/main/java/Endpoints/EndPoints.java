package Endpoints;

public enum  EndPoints{
    PetByIdEndPoint("/pet/{petId}"),
    PetByStatusEndPoint("/pet/findByStatus"),
    PetEndPoint("/pet");
   public String value;
   EndPoints(String value) {
        this.value= value;
    }
}
