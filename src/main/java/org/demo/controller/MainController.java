package org.demo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField txtNome;
    @FXML
    private  TextField txtSenha;
    @FXML
    private Button btnSalvar;

    @FXML
    public void onBtnSalvarAction(){
        System.out.println("Clique Salvar");
    }
}