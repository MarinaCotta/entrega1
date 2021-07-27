
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Artigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int num_ordem;
    private String idioma;
    private String titulo_original;
    private String titulo_ingles;
    private String resumo_original;
    private String resumo_ingles;
    private String palavras_chave_orig;
    private String palavras_chave_ingles;
    private int num_paginas;
    @ManyToMany
    private List<Autor> lista_autores;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
     public int getNum_ordem() {
        return num_ordem;
    }

    public void setNum_ordem(int num_ordem) {
        this.num_ordem = num_ordem;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTitulo_original() {
        return titulo_original;
    }

    public void setTitulo_original(String titulo_original) {
        this.titulo_original = titulo_original;
    }

    public String getTitulo_ingles() {
        return titulo_ingles;
    }

    public void setTitulo_ingles(String titulo_ingles) {
        this.titulo_ingles = titulo_ingles;
    }

    public String getResumo_original() {
        return resumo_original;
    }

    public void setResumo_original(String resumo_original) {
        this.resumo_original = resumo_original;
    }

    public String getResumo_ingles() {
        return resumo_ingles;
    }

    public void setResumo_ingles(String resumo_ingles) {
        this.resumo_ingles = resumo_ingles;
    }

    public String getPalavras_chave_orig() {
        return palavras_chave_orig;
    }

    public void setPalavras_chave_orig(String palavras_chave_orig) {
        this.palavras_chave_orig = palavras_chave_orig;
    }

    public String getPalavras_chave_ingles() {
        return palavras_chave_ingles;
    }

    public void setPalavras_chave_ingles(String palavras_chave_ingles) {
        this.palavras_chave_ingles = palavras_chave_ingles;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    public List<Autor> getLista_autores() {
        return lista_autores;
    }

    public void setLista_autores(List<Autor> lista_autores) {
        this.lista_autores = lista_autores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artigo)) {
            return false;
        }
        Artigo other = (Artigo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Artigo[ id=" + id + " ]";
    }
    
}
