/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.List;
import DAOdataperpustakaan.dataperpusDAO;
import DAOImplement.dataimplement;
import model.*;
import view.*;

/**
 *
 * @author PC PRAKTIKUM
 */
public class datacontroller {
    Perpustakaan frame;
    dataimplement impldata;
    List<dataperpustakaan> ps;
    
    public datacontroller(Perpustakaan frame){
        this.frame = frame;
        impldata = new dataperpusDAO();
        ps = impldata.getAll();
    }
    
    public void isitabel(){
        ps = impl.datagetAll();
        modeltabel ma new modeltabel(ps);
        frame.getTabelData().setModel(ma);
    }
    
    public void insert(){
        dataperpustakaan ps = new dataperpustakaan();
        //ps.setId(frame.getJTextid().getText());
        ps.setJudul(frame.getJTextjudul().getText());
        ps.setGenre(frame.getJTextgenre().getText());
        ps.setPenulis(frame.getJTextpenulis().getText());
        ps.setPenerbit(frame.getJTextpenerbit().getText());
        ps.setLokasi(frame.getJTextlokasi().getText());
        int s = Integer.parseInt(frame.getJTextstock().getText());
        ps.setStock(s);
    }
    
    public void update(){
        dataperpustakaan ps = new dataperpustakaan();
        ps.setJudul(frame.getJTextjudul().getText());
        ps.setGenre(frame.getJTextgenre().getText());
        ps.setPenulis(frame.getJTextpenulis().getText());
        ps.setPenerbit(frame.getJTextpenerbit().getText());
        ps.setLokasi(frame.getJTextlokasi().getText());
        int s = Integer.parseInt(frame.getJTextstock().getText());
        ps.setStock(s);
    }
    
    public void delete(){
         int d = Integer.parseInt(frame.getJTextid().getText());
         impldata.delete(d);
    }
}
