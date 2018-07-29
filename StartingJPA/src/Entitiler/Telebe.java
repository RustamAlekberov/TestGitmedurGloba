/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitiler;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rusta
 */
@Entity
@Table(name = "telebe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telebe.findAll", query = "SELECT t FROM Telebe t")
    , @NamedQuery(name = "Telebe.findByIdTelebe", query = "SELECT t FROM Telebe t WHERE t.idTelebe = :idTelebe")
    , @NamedQuery(name = "Telebe.findByAd", query = "SELECT t FROM Telebe t WHERE t.ad = :ad")
    , @NamedQuery(name = "Telebe.findBySoyad", query = "SELECT t FROM Telebe t WHERE t.soyad = :soyad")
    , @NamedQuery(name = "Telebe.findByYash", query = "SELECT t FROM Telebe t WHERE t.yash = :yash")})
public class Telebe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTelebe")
    private Integer idTelebe;
    @Basic(optional = false)
    @Column(name = "Ad")
    private String ad;
    @Basic(optional = false)
    @Column(name = "Soyad")
    private String soyad;
    @Basic(optional = false)
    @Column(name = "Yash")
    private int yash;
    @JoinColumn(name = "idQrup", referencedColumnName = "idQrup")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Qrup idQrup;

    public Telebe() {
    }

    public Telebe(Integer idTelebe) {
        this.idTelebe = idTelebe;
    }

    public Telebe(Integer idTelebe, String ad, String soyad, int yash) {
        this.idTelebe = idTelebe;
        this.ad = ad;
        this.soyad = soyad;
        this.yash = yash;
    }

    public Integer getIdTelebe() {
        return idTelebe;
    }

    public void setIdTelebe(Integer idTelebe) {
        this.idTelebe = idTelebe;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYash() {
        return yash;
    }

    public void setYash(int yash) {
        this.yash = yash;
    }

    public Qrup getIdQrup() {
        return idQrup;
    }

    public void setIdQrup(Qrup idQrup) {
        this.idQrup = idQrup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTelebe != null ? idTelebe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telebe)) {
            return false;
        }
        Telebe other = (Telebe) object;
        if ((this.idTelebe == null && other.idTelebe != null) || (this.idTelebe != null && !this.idTelebe.equals(other.idTelebe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitiler.Telebe[ idTelebe=" + idTelebe + " ]";
    }
    
}
