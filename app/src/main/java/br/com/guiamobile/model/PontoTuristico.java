package br.com.guiamobile.model;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

import java.io.Serializable;

import br.com.guiamobile.R;

/**
 * Created by Gilberto on 27/04/2016.
 *
 * @author Gilberto Feitosa Junior
 *         "Essa é uma classe modelo do ponto turistico"
 */
public class PontoTuristico extends Activity implements Serializable {

    private Integer pontoTuristicoID;
    private String titulo;
    private String descricao;
    private String pontoTuristico;

    public PontoTuristico(Integer pontoTuristicoID, String titulo, String descricao, String pontoTuristico) {
        this.pontoTuristicoID = pontoTuristicoID;
        this.titulo = titulo;
        this.descricao = descricao;
        this.pontoTuristico = pontoTuristico;
    }


    public Integer getPontoTuristicoID() {
        return pontoTuristicoID;
    }

    public void setPontoTuristicoID(Integer pontoTuristicoID) {
        this.pontoTuristicoID = pontoTuristicoID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPontoTuristico() {
        return pontoTuristico;
    }

    public void setPontoTuristico(String pontoTuristico) {
        this.pontoTuristico = pontoTuristico;
    }




   public static void MostrarImagem(View view, String img) {
        ImageView imageView = (ImageView) view.findViewById(R.id.imagem);

        switch (img) {
            case "marco":
                imageView.setImageResource(R.drawable.ic_museu);
                break;

        }
    }
}
