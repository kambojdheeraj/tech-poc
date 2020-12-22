package com.example.reactor.dto;

public class Player {
	
	private String firstName;
	private String lastNAme;
	
	
	public Player(String firstName, String lastNAme) {
		super();
		this.firstName = firstName;
		this.lastNAme = lastNAme;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastNAme == null) ? 0 : lastNAme.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastNAme == null) {
			if (other.lastNAme != null)
				return false;
		} else if (!lastNAme.equals(other.lastNAme))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastNAme + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNAme() {
		return lastNAme;
	}
	public void setLastNAme(String lastNAme) {
		this.lastNAme = lastNAme;
	}
	
	

}
