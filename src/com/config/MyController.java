/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.config;

import java.sql.SQLException;
//import config.MyConfig;
//import models.Produk;
/**
 *
 * @author LENOVO
 */
public class MyController extends MyConfig{
    public static void getDatabase() {
        connection();
        try {
            // query = "SELECT nama, harga, stok FROM tb_produk ORDER BY ID DESC";
            query = "SELECT NAMA, HARGA, JUMLAH FROM tb_produk";

            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                System.out.println(
                    String.format("%s - Rp.%d - Stok %d", resultSet.getString("NAMA"), resultSet.getInt("HARGA"), resultSet.getInt("JUMLAH"))
                );
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Produk getProdukByNama(String NAMA) {
        Produk produk = null;
        connection();
        query = "SELECT * FROM tb_produk WHERE NAMA=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, NAMA);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                produk = new Produk(resultSet.getInt("ID"), resultSet.getString("NAMA"), resultSet.getLong("HARGA"), resultSet.getInt("JUMLAH"));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produk;
    }

    public static boolean insertData(String NAMA, long HARGA, int JUMLAH) {
        connection();
        query = "INSERT INTO tb_produk (NAMA, HARGA, JUMLAH) VALUES (?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, NAMA);
            preparedStatement.setLong(2, HARGA);
            preparedStatement.setInt(3, JUMLAH);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void updateNama(int ID, String NAMA) {
       connection();
        query = "UPDATE tb_produk SET NAMA=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, NAMA);
            preparedStatement.setInt(2, ID);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateHarga(int ID, long HARGA) {
        connection();
        query = "UPDATE tb_produk SET HARGA=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, HARGA);
            preparedStatement.setInt(2, ID);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateJumlah(int ID, int JUMLAH) {
       connection();
        query = "UPDATE tb_produk SET JUMLAH=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, JUMLAH);
            preparedStatement.setInt(2, ID);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean deleteData(String NAMA) {
        connection();
        query = "DELETE FROM tb_produk WHERE NAMA=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, NAMA);
            int affectedRowDelete = preparedStatement.executeUpdate();
            if (affectedRowDelete > 0) {
                return true;
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

