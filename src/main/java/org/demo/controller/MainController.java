package org.demo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.demo;

public class MainController {
    @FXML
    private TextField txtNome;
    @FXML
    private  TextField txtSenha;
    @FXML
    private Button btnSalvar;
    private demo demo;

    //**************************q
    @FXML
    public void onBtnSalvarAction(){
        this.demo = new demo();
        demo.setNome( txtNome.getText() );
        demo.setSenha( txtSenha.getText() );
        System.out.println("Nome: " + demo.getNome() );
        System.out.println(" Senha: " +demo.getSenha() );

    }
}