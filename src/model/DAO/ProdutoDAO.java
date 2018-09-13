package model.DAO;

import Objetos.Produto;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
public class ProdutoDAO {

    public void create(Produto p) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("Insert into TBL_PRODUTO (descricao, valor, quantidade) values (?, ?, ?)");
            stmt.setString(1, p.getDescricao());
            stmt.setDouble(2, p.getValor());
            stmt.setInt(3, p.getQuantidade());

            stmt.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public List<Produto> read() {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM TBL_PRODUTO");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setValor(rs.getDouble("valor"));
                p.setQuantidade(rs.getInt("quantidade"));
                produtos.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return produtos;
    }

    public void Update(Produto p) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE TBL_PRODUTO SET descricao = ?, quantidade = ?, valor = ? WHERE id = ?");
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getValor());
            stmt.setInt(4, p.getId());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
