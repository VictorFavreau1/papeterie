package fr.eni.ihm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EcranPrincipal ecranArticle = new EcranPrincipal();
        });
    }
}
