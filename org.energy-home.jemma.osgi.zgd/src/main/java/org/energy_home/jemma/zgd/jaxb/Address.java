/**
 * This file is part of JEMMA - http://jemma.energy-home.org
 * (C) Copyright 2010 Telecom Italia (http://www.telecomitalia.it)
 *
 * JEMMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) version 3
 * or later as published by the Free Software Foundation, which accompanies
 * this distribution and is available at http://www.gnu.org/licenses/lgpl.html
 *
 * JEMMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License (LGPL) for more details.
 *
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.27 at 12:45:05 PM CEST 
//


package org.energy_home.jemma.zgd.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkAddress" type="{http://www.zigbee.org/GWGSchema}NetworkAddress" minOccurs="0"/>
 *         &lt;element name="IeeeAddress" type="{http://www.zigbee.org/GWGSchema}IeeeAddress" minOccurs="0"/>
 *         &lt;element name="AliasAddress" type="{http://www.zigbee.org/GWGSchema}AliasAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "networkAddress",
    "ieeeAddress",
    "aliasAddress"
})
public class Address implements Serializable {

	@XmlElement(name = "NetworkAddress")
    protected Integer networkAddress;
    @XmlElement(name = "IeeeAddress")
    protected BigInteger ieeeAddress;
    @XmlElement(name = "AliasAddress")
    protected String aliasAddress;

    /**
     * Gets the value of the networkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetworkAddress() {
        return networkAddress;
    }

    /**
     * Sets the value of the networkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetworkAddress(Integer value) {
        this.networkAddress = value;
    }

    /**
     * Gets the value of the ieeeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIeeeAddress() {
        return ieeeAddress;
    }

    /**
     * Sets the value of the ieeeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIeeeAddress(BigInteger value) {
        this.ieeeAddress = value;
    }

    /**
     * Gets the value of the aliasAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasAddress() {
        return aliasAddress;
    }

    /**
     * Sets the value of the aliasAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasAddress(String value) {
        this.aliasAddress = value;
    }

}
