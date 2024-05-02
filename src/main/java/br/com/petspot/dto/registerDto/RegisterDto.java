package br.com.petspot.dto.registerDto;

import jakarta.validation.constraints.Email;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public record RegisterDto(
        @Email
        String email,
        String senha,
        String usuario,
        String nome,
        String sobrenome,
        String dataDeNascimento
) {

        public Date getDate() {
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

            try {
                return format.parse(dataDeNascimento);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
}
