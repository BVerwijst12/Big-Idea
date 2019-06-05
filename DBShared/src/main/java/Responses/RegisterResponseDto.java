package Responses;

public class RegisterResponseDto {
    private String username;
    private boolean isSucces;

    public RegisterResponseDto(String username, boolean isSucces){
        this.username = username;
        this.isSucces = isSucces;
    }
}
