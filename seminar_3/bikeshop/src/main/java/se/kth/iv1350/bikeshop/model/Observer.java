package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
 

/**
 * This interface uses the Observer pattern. 
 */
public interface Observer {
    void repairOrderStateHasChanged(RepairOrderDTO repairOrder, se.kth.iv1350.bikeshop.dto.BikeDTO bikeDTO);
}
//la till se.kth.iv1350.bikeshop.dto.BikeDTO bikeDTO