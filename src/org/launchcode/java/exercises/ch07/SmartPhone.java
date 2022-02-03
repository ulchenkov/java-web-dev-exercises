package org.launchcode.java.exercises.ch07;

public class SmartPhone extends Computer {
    private String supportedWirelessTechnologies;
    private boolean _isLocked;

    public SmartPhone(String cpu, int ramSize, String os, double screenSize,
                      String supportedWirelessTechnologies, boolean isLocked) {
        super(cpu, ramSize, os, screenSize);
        this.supportedWirelessTechnologies = supportedWirelessTechnologies;
        this._isLocked = isLocked;
    }

    public String getSupportedWirelessTechnologies() {
        return supportedWirelessTechnologies;
    }

    public boolean isLocked() {
        return _isLocked;
    }

    @Override
    public String toString() {
        return String.format("CPU: %s; RAM: %sGb; Screen Size: %s\"; OS: %s; Wireless: %s; Locked: %s", getCpu(), getRamSize(),
                getScreenSize(), getOs(), supportedWirelessTechnologies, _isLocked ? "YES" : "NO");
    }
}
