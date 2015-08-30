
package server.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de movie complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="movie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoLancamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="diretor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elenco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie", propOrder = {
    "anoLancamento",
    "diretor",
    "elenco",
    "genero",
    "name"
})
public class Movie {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar anoLancamento;
    protected String diretor;
    protected String elenco;
    protected String genero;
    protected String name;

    /**
     * Obtém o valor da propriedade anoLancamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * Define o valor da propriedade anoLancamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnoLancamento(XMLGregorianCalendar value) {
        this.anoLancamento = value;
    }

    /**
     * Obtém o valor da propriedade diretor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * Define o valor da propriedade diretor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiretor(String value) {
        this.diretor = value;
    }

    /**
     * Obtém o valor da propriedade elenco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElenco() {
        return elenco;
    }

    /**
     * Define o valor da propriedade elenco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElenco(String value) {
        this.elenco = value;
    }

    /**
     * Obtém o valor da propriedade genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define o valor da propriedade genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
