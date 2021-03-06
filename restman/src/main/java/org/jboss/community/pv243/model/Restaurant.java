package org.jboss.community.pv243.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Restaurant
 *
 */
@Entity
@XmlRootElement
@NamedQuery(name="Restaurant.findAll", query="SELECT r FROM Restaurant r")
public class Restaurant extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<MenuItem> menu;
	private String information;

	public Restaurant() {
		super();
	}

	// TODO: lazy fetch throws exception
	public Collection<MenuItem> getMenu() {
		return menu;
	}

	public void setMenu(Collection<MenuItem> menu) {
		this.menu = menu;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
   
	@Override
	public boolean equals(Object obj) {
		// TODO Better handling !!!
		return this.getId() == ((Restaurant) obj).getId();
	}
	
}
