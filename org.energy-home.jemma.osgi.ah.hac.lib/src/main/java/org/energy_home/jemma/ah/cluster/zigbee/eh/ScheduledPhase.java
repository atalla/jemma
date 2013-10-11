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
package org.energy_home.jemma.ah.cluster.zigbee.eh;

public class ScheduledPhase {
	public short EnergyPhaseID;
	public int ScheduledTime;

	public ScheduledPhase(short EnergyPhaseID, int ScheduledTime) {
		this.EnergyPhaseID = EnergyPhaseID;
		this.ScheduledTime = ScheduledTime;
	}

	public ScheduledPhase() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		sb.append("EnergyPhaseID=").append(EnergyPhaseID);
		sb.append(", ScheduledTime=").append(ScheduledTime);
		sb.append("}");
		return sb.toString();		
	}
}
