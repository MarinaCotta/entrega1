
package persistencia;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;


@Entity
public class Volume implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String sigla_evento;
    private int num_edicao;
    private String cidade;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_inicio;
    private String descr_port;
    private String descr_ingles;
    @OneToMany
    private List<Artigo> lista_artigos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getSigla_evento() {
        return sigla_evento;
    }

    public void setSigla_evento(String sigla_evento) {
        this.sigla_evento = sigla_evento;
    }

    public int getNum_edicao() {
        return num_edicao;
    }

    public void setNum_edicao(int num_edicao) {
        this.num_edicao = num_edicao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getDescr_port() {
        return descr_port;
    }

    public void setDescr_port(String descr_port) {
        this.descr_port = descr_port;
    }

    public String getDescr_ingles() {
        return descr_ingles;
    }

    public void setDescr_ingles(String descr_ingles) {
        this.descr_ingles = descr_ingles;
    }

    public List<Artigo> getLista_artigos() {
        return lista_artigos;
    }

    public void setLista_artigos(List<Artigo> lista_artigos) {
        this.lista_artigos = lista_artigos;
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
        if (!(object instanceof Volume)) {
            return false;
        }
        Volume other = (Volume) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Volume[ id=" + id + " ]";
    }
    
}
