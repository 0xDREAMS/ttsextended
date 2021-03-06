package com.dreams.ttsextended.enums;

public enum Gender {
	FEMALE(),
	MALE(),
	UNKNOWN();
	
	public boolean isFemale() {
		return this.equals(FEMALE);
	}
	
	public Gender reverse() {
		if (this == FEMALE) {
			return MALE;
		} else {
			return FEMALE;
		}
	}
	
	public static Gender get(boolean female) {
		if (female) {
			return FEMALE;
		} else {
			return MALE;
		}
	}
}
