/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.PreparedStatement;

public class ComodoDAO {
        private ConexaBanco conexao = new ConexaBanco();

    private final String INSERT = "INSERT INTO COMODO(NOME, LARGURA, COMPRIMENTO ) VALUES (?, ?, ?);";

    private final String DELETE = "DELETE FROM COMODO WHERE ID_COMODO = ?;";

    private final String LIST = "SELECT * FROM COMODO ORDER BY ID_COMODO";
    
}
