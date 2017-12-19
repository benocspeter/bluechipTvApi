package hu.unideb.inf.benocspeter.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@javax.xml.bind.annotation.XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Price {

    @XmlValue
    private BigDecimal value;

    @XmlAttribute(name = "currency", required = true)
    @XmlSchemaType(name = "token")
    private String currency;

    public Price() {
    }

    public Price(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}