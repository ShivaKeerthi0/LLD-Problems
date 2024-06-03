package onlineshoppingsystem;

import java.util.Map;

public class Unit {
    long unitId;
    int unitName;
    Location unitLocation;
    UnitOwner owner;
    UnitStatus status;
    Map<Item,Integer> itemMap;

    public int getUnitName() {
        return unitName;
    }

    public Location getUnitLocation() {
        return unitLocation;
    }

    public long getUnitId() {
        return unitId;
    }

    public void setStatus(UnitStatus status) {
        this.status = status;
    }

    public UnitStatus getStatus() {
        return status;
    }
}
