package br.com.petspot.model.dto.loginDto;

import lombok.Data;

@Data
public class MessageLoginDto {
    private final String message = "Usuário logado";
    private String email;
    public MessageLoginDto(String email){
        this.email = email;
    }
}
