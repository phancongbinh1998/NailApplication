/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binh.dao;

import binh.dto.contactDTO;
import binh.dto.nailDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import sample.utils.DBConnection;

/**
 *
 * @author Mochi
 */
public class nailDAO {
    private List<nailDTO> list;
    public List<nailDTO> getList(){
        return list;
    }
    public boolean getService() throws SQLException, NamingException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs  = null;
        try {
            conn = DBConnection.makeConnection();
            if(conn != null){
                String sql = "Select * from tblService order by date DESC";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                while(rs.next()){
                    String service = rs.getString("service");
                    String picture = rs.getString("picture");
                    String detail = rs.getString("detail");
                    Double price = rs.getDouble("price");
                    Date date = rs.getDate("date");
                    
                    nailDTO dto = new nailDTO(service, picture, detail, price, date);
                    if(this.list == null){
                        this.list = new ArrayList<nailDTO>();
                    }
                    if(list.size() <= 3){
                        this.list.add(dto);
                    }
                    
                    
                }
                
            }
        } finally {
            if(rs != null){
                rs.close();
            }
            if(stm != null){
                stm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return false;
    }
    
    private List<contactDTO> listContact;
    public List<contactDTO> getListContact(){
        return listContact;
    }
    public boolean getContact() throws SQLException, NamingException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs  = null;
        try {
            conn = DBConnection.makeConnection();
            if(conn != null){
                String sql = "Select * from tblContact";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                while(rs.next()){
                    String address = rs.getString("address");
                    String city = rs.getString("city");
                    String country = rs.getString("country");
                    String tel = rs.getString("tel");
                    String email = rs.getString("email");
                    String monToFri = rs.getString("monToFri");
                    String saturday = rs.getString("saturday");
                    Date date = rs.getDate("date");
                    
                    contactDTO dto = new contactDTO(address, city, country, tel, email, monToFri, saturday, date);
                    if(this.listContact == null){
                        this.listContact = new ArrayList<contactDTO>();
                    }
                    this.listContact.add(dto);
                    
                }
                
            }
        } finally {
            if(rs != null){
                rs.close();
            }
            if(stm != null){
                stm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return false;
    }
    private int count;
    public int returntCount(){
        return count;
    }
    public boolean getCount() throws SQLException, NamingException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs  = null;
        try {
            conn = DBConnection.makeConnection();
            if(conn != null){
                String sql = "Select * from tblCount";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                if(rs.next()){
                    int count = rs.getInt("count");
                    this.count = count;
                }
                
            }
        } finally {
            if(rs != null){
                rs.close();
            }
            if(stm != null){
                stm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return false;
    }
    
    public boolean updateCount(int count) throws SQLException, NamingException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = DBConnection.makeConnection();
            if(conn != null){
                String sql = "Update tblCount set count = ?";
                stm = conn.prepareStatement(sql);
                stm.setInt(1, count);
                int row = stm.executeUpdate();
                if(row > 0){
                    return true;
                }
                
            }
        } finally {
           
            if(stm != null){
                stm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return false;
    }
}
