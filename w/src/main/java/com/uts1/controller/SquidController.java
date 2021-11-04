package com.uts1.controller;

import com.uts1.dao.hutangDao;
import com.uts1.dao.playerDao;
import com.uts1.entity.hutang;
import com.uts1.entity.player;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author william
 */
public class SquidController implements Initializable {
    public TableView <player> tablePemain;
    public ComboBox  <player> cmbPeserta;
    public TextField txtPemberiUtang;
    public TextField txtJumlah;
    public TableView <hutang>tableHutang;
    public TableColumn<Integer,player> col01;
    public TableColumn <String, hutang>col02;
    public TableColumn <Integer,player>col03;
    public Button btnHapusHutng;
    public Button btnAdd;
    public Button btnEdit;
    public Button btnHapus;
    public Button btnTmbhHutng;

    private player player;
    private hutang hutang;
    private com.uts1.dao.hutangDao hutangDao;
    private com.uts1.dao.playerDao playerDao;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerDao = new playerDao();
        hutangDao = new hutangDao();
        playerDao = FXCollections.observableArrayList();
        hutangDao = FXCollections.observableArrayList();

        try {
            hutangDao.addAll(hutangDao.fetchAllList());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(SquidController.class.getName()).log(Level.SEVERE, null, ex);

        }
        tableHutang.setItems(playerDao);
        cmbPeserta.setItems(player);

        col01.setCellValueFactory(data -> new SimpleObjectProperty(data.getValue().getClass()));
        col02.setCellValueFactory(data -> new SimpleObjectProperty(data.getValue().getClass()));
        col03.setCellValueFactory(data -> new SimpleObjectProperty(data.getValue().getClass()));

    }

    public void HpshtngAaction(ActionEvent actionEvent) {
    }

    public void TmbhHtngAction(ActionEvent actionEvent) {
        if (txtJumlah.getText().trim().isEmpty() || txtPemberiUtang.getText().trim().isEmpty() || cmbPeserta.getSelectionModel().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Data belum lengkap!!");
            alert.showAndWait();
        } else {
            player players = new player();
            players.setID(players.getID());
            players.setNama(players.getNama());
            players.setUmur(players.getUmur());
            players.setKeahlian(players.getKeahlian());
            try {
                int result = playerDao.addData(player);
                if (result == 1) {
                    txtPemberiUtang.clear();
                    txtJumlah.clear();
                    playerDao.addData(playerDao.fetchAllList(player));
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void HapusAaction(ActionEvent actionEvent) {
    }

    public void EditAction(ActionEvent actionEvent) {
        String id = txtJumlah.getText();
        player player = cmbPeserta.getValue();
        String task = txtPemberiUtang.getText();

        hutang hutang = tableHutang.getSelectionModel().getSelectedItem();
        int selected = tableHutang.getSelectionModel().getSelectedIndex();
        hutang.setId(Integer.parseInt(id));
        hutang.setPemberiHutang(String.valueOf(player));
        hutang.setJumlah(Integer.parseInt(Jumlah));
        hutang.setPlayer(String.valueOf(player));
        try {
            int result = playerDao.updateData(player);
            if (result == 1) {
                player.remove(selected);
                player.clear();
                player.addAll(playerDao.fetchList(thisUser));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void AddAction(ActionEvent actionEvent) {
    }
}
