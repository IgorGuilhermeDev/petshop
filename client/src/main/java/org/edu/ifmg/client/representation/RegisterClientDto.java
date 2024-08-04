package org.edu.ifmg.client.representation;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.edu.ifmg.client.model.Client;

import java.util.UUID;

@Data
public class RegisterClientDto {

    @NotBlank private String cpf;
    @NotBlank private String name;
    @Min(0) @Max(200) private Integer age;

    public Client toModel(){
        var client = Client.builder().name(this.name).age(this.age).cpf(this.cpf).build();
        client.setId(UUID.randomUUID());
        return client;
    }
}
