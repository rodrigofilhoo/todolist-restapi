//usando a dependência Lombok (no arquivo pom.xml)

package br.com.cruzeiro.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_users") //nome do bando de dados
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID") //gera automaticante o UUID
    private UUID id; //chave primária passada com uuid

    @Column(unique = true) //apenas um usuário (apenas o que estiver em baixo do Column
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt; // exibe a hora emm que o usuário foi criado

}
