

/**
 * A classe User representa um usuário e fornece métodos para uma conexão MySQL(Banco de Dados), verificando um usuário com base em um login e uma senha.
 **/
package com.mycompany.teste_caixa_branc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    /**
     * Este método é responsável por estabelecer uma conexão com o banco de dados MySQL.
     *
     * @return Uma instância de java.sql.Connection que representa a conexão com o banco de dados.
     **/
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC para MySQL (é possível notar um erro nesta parte)
            Class.forName("com.mysql.Driver.Manager").newInstance();

            // Configura a URL de conexão com o banco de dados MySQL
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";

            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Lidar com exceções, caso ocorram, como ClassNotFoundException, SQLException, etc.
        }
        return conn;
    }

    /**
     * Nome do usuário.
     **/
    public String nome = "";

    /**
     * Resultado da verificação do usuário (verdadeiro se o usuário for válido, falso caso contrário).
     **/
    public boolean result = false;

    /**
     * Este método é utilizado para verifica se um usuário está no banco de dados, com base em um login e senha fornecidos.
     *
     * @param login O login do usuário que está sendo verificado.
     * @param senha A senha do usuário que está sendo verificado.
     * @return Verdadeiro se o usuário for válido, falso caso contrário.
     **/
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD(); // Obtém uma conexão com o banco de dados

        // INSTRUÇÃO SQL para selecionar o nome do usuário com base no login e senha
        sql += "select nome from usuários ";
        sql += "where login = " + "'" + login + "'";
        sql += "  and senha  = " + "'" + senha + "';";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Verifica se um registro foi encontrado no banco de dados
            if (rs.next()) {
                result = true; // Define o resultado como verdadeiro
                nome = rs.getString("nome"); // Obtém o nome do usuário do resultado
            }
        } catch (Exception e) {
            // Lidar com exceções, caso ocorram, como SQLException, etc.
        }
        return result;
    }
}

