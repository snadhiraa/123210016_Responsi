/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplement;
import java.util.List;
import model.*;

/**
 *
 * @author PC PRAKTIKUM
 */
public interface dataimplement {
    public void insert(dataperpustakaan k);
    public void update(dataperpustakaan k);
    public void delete(int id);
    public List<dataperpustakaan>getAll();
}
