/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdataperpustakaan;
import java.sql.*;
import java.util.*;
import Koneksi.connector;
import model.*;
import DAOImplement.dataimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC PRAKTIKUM
 */
public class dataPerpustakaanDAO implements dataimplement{
    Connection;
    final String select = "SELECT * FROM dataperpus;";
    final String insert = "INSERT INTO dataperpus (judul,"+ "genre, penulis, penerbit, lokasi, stock)" + "VALUES (?,?,?,?,?,?,?);";
    final String update = "UPDATE dataperpus SET judul=?, genre=?, penulis=?, penerbit=?, lokasi=?, stock=?" + "WHERE id=?;";
    
    public dataPerpustakaanDAO(){
        connection = connector.connection();
        
        @Override
        public void insert(dataperpustakaan i){
            PreparedStatement statement = null;
            try{
                statement = connection.prepareStatement(insert,Statement.RETURN_GENERATED_KEYS);
                statement.setString(1, i.getJudul());
                statement.setString(2, i.getGenre());
                statement.setString(3, i.getPenulis());
                statement.setString(4, i.getPenerbit());
                statement.setString(5, i.getLokasi());
                statement.setInt(6, i.getStock());
                statement.executeUpdate();
            }catch(SQLException ex){
                ex.printStackTrace();
            }finally{
                try{
                    statement.close();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
            }
        }
        
        @Override
        public void delete(int id){
            PreparedStatement statement = null;
            try{
                statement = connection.prepareStatement(delete);
                statement.executeUpdate();
            }catch(SQLException ex){
                ex.printStackTrace();
            }finally{
                try{
                    statement.close();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
            }
        }
        
        @Override
        public List<dataperpustakaan> getAll(){
        
        }
    }
}
