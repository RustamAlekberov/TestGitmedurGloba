/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitiler;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rusta
 */
@Entity
@Table(name = "qrup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Qrup.findAll", query = "SELECT q FROM Qrup q")
    , @NamedQuery(name = "Qrup.findByIdQrup", query = "SELECT q FROM Qrup q WHERE q.idQrup = :idQrup")
    , @NamedQuery(name = "Qrup.findByQrupAdi", query = "SELECT q FROM Qrup q WHERE q.qrupAdi = :qrupAdi")
    , @NamedQuery(name = "Qrup.findByQrupKodu", query = "SELECT q FROM Qrup q WHERE q.qrupKodu = :qrupKodu")})
public class Qrup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idQrup")
    private Integer idQrup;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "QrupAdi")
    private String qrupAdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "QrupKodu")
    private String qrupKodu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idQrup", fetch = FetchType.LAZY)
    private List<Telebe> telebeList;

    public Qrup() {
    }

    public Qrup(Integer idQrup) {
        this.idQrup = idQrup;
    }

    public Qrup(Integer idQrup, String qrupAdi, String qrupKodu) {
        this.idQrup = idQrup;
        this.qrupAdi = qrupAdi;
        this.qrupKodu = qrupKodu;
    }

    public Integer getIdQrup() {
        return idQrup;
    }

    public void setIdQrup(Integer idQrup) {
        this.idQrup = idQrup;
    }

    public String getQrupAdi() {
        return qrupAdi;
    }

    public void setQrupAdi(String qrupAdi) {
        this.qrupAdi = qrupAdi;
    }

    public String getQrupKodu() {
        return qrupKodu;
    }

    public void setQrupKodu(String qrupKodu) {
        this.qrupKodu = qrupKodu;
    }

    @XmlTransient
    public List<Telebe> getTelebeList() {
        return telebeList;
    }

    public void setTelebeList(List<Telebe> telebeList) {
        this.telebeList = telebeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idQrup != null ? idQrup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Qrup)) {
            return false;
        }
        Qrup other = (Qrup) object;
        if ((this.idQrup == null && other.idQrup != null) || (this.idQrup != null && !this.idQrup.equals(other.idQrup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitiler.Qrup[ idQrup=" + idQrup + " ]";
    }
    
}
