package de.dytanic.cloudnet.ext.bridge.player;

import com.google.gson.reflect.TypeToken;
import de.dytanic.cloudnet.driver.network.HostAndPort;
import de.dytanic.cloudnet.ext.bridge.WorldPosition;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.lang.reflect.Type;
import java.util.UUID;

@ToString
@EqualsAndHashCode
public final class NetworkPlayerServerInfo {

    public static final Type TYPE = new TypeToken<NetworkPlayerServerInfo>() {
    }.getType();

    protected UUID uniqueId;

    protected String name, xBoxId;

    protected double health, maxHealth, saturation;

    protected int level;

    protected WorldPosition location;

    protected HostAndPort address;

    protected NetworkServiceInfo networkService;

    public NetworkPlayerServerInfo(UUID uniqueId, String name, String xBoxId, double health, double maxHealth, double saturation, int level, WorldPosition location, HostAndPort address, NetworkServiceInfo networkService) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.xBoxId = xBoxId;
        this.health = health;
        this.maxHealth = maxHealth;
        this.saturation = saturation;
        this.level = level;
        this.location = location;
        this.address = address;
        this.networkService = networkService;
    }

    public NetworkPlayerServerInfo() {
    }

    public UUID getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(UUID uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXBoxId() {
        return this.xBoxId;
    }

    public void setXBoxId(String xBoxId) {
        this.xBoxId = xBoxId;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getSaturation() {
        return this.saturation;
    }

    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public WorldPosition getLocation() {
        return this.location;
    }

    public void setLocation(WorldPosition location) {
        this.location = location;
    }

    public HostAndPort getAddress() {
        return this.address;
    }

    public void setAddress(HostAndPort address) {
        this.address = address;
    }

    public NetworkServiceInfo getNetworkService() {
        return this.networkService;
    }

    public void setNetworkService(NetworkServiceInfo networkService) {
        this.networkService = networkService;
    }

}