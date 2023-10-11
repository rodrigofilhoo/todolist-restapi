//usando a dependência Lombok (no arquivo pom.xml)

package br.com.cruzeiro.todolist.user;

import lombok.Data;

@Data
public class UserModel {

    //Se não tiver modificador na frente = public
    private String username;
    private String name;
    private String password;

}
