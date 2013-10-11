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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScanChannels" type="{http://www.zigbee.org/GWGSchema}unsigned32Bit" minOccurs="0"/>
 *         &lt;element name="ScanDuration" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="BeaconOrder" type="{http://www.zigbee.org/GWGSchema}unsignedNibble"/>
 *         &lt;element name="SuperFrameOrder" type="{http://www.zigbee.org/GWGSchema}unsignedNibble"/>
 *         &lt;element name="BatteryLifeExtension" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkConfiguration", propOrder = {
    "scanChannels",
    "scanDuration",
    "beaconOrder",
    "superFrameOrder",
    "batteryLifeExtension"
})
public class NetworkConfiguration {

    @XmlElement(name = "ScanChannels")
    protected Long scanChannels;
    @XmlElement(name = "ScanDuration")
    @XmlSchemaType(name = "unsignedByte")
    protected Short scanDuration;
    @XmlElement(name = "BeaconOrder")
    protected short beaconOrder;
    @XmlElement(name = "SuperFrameOrder")
    protected short superFrameOrder;
    @XmlElement(name = "BatteryLifeExtension")
    protected boolean batteryLifeExtension;

    /**
     * Gets the value of the scanChannels property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScanChannels() {
        return scanChannels;
    }

    /**
     * Sets the value of the scanChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScanChannels(Long value) {
        this.scanChannels = value;
    }

    /**
     * Gets the value of the scanDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getScanDuration() {
        return scanDuration;
    }

    /**
     * Sets the value of the scanDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setScanDuration(Short value) {
        this.scanDuration = value;
    }

    /**
     * Gets the value of the beaconOrder property.
     * 
     */
    public short getBeaconOrder() {
        return beaconOrder;
    }

    /**
     * Sets the value of the beaconOrder property.
     * 
     */
    public void setBeaconOrder(short value) {
        this.beaconOrder = value;
    }

    /**
     * Gets the value of the superFrameOrder property.
     * 
     */
    public short getSuperFrameOrder() {
        return superFrameOrder;
    }

    /**
     * Sets the value of the superFrameOrder property.
     * 
     */
    public void setSuperFrameOrder(short value) {
        this.superFrameOrder = value;
    }

    /**
     * Gets the value of the batteryLifeExtension property.
     * 
     */
    public boolean isBatteryLifeExtension() {
        return batteryLifeExtension;
    }

    /**
     * Sets the value of the batteryLifeExtension property.
     * 
     */
    public void setBatteryLifeExtension(boolean value) {
        this.batteryLifeExtension = value;
    }

}
