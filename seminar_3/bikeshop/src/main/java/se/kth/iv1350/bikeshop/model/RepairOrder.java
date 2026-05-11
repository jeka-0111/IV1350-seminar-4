package se.kth.iv1350.bikeshop.model;

import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;

/**
 * RepairOrders are handled in this class.
 * Needs to import all DTO classes, RepairTask, registries! check how to import 
 */

public class RepairOrder{ 

    public enum RepairOrderState {
        NEWLY_CREATED,
        READY_FOR_APPROVAL,
        REJECTED,
        ACCEPTED
    }

    //list of repairtasks
    private List<RepairTaskDTO > repairTasks;
    //TotalCostOfRepairTasks är et fält som model behöver för att det vi skapar ska kunna fortsätta existera så länge objektet finns
    private double totalCostOfRepairTasks;

    private RepairOrderState state;

      
    //konstruktor av RO
    public RepairOrder (RepairOrderDTO repairOrderDTO, 
                        CustomerDTO customer, 
                        BikeDTO bike, 
                        DiagnosticReportDTO problemDescription, 
                        int date){
        this.repairTasks = new ArrayList<>();
        this.totalCostOfRepairTasks = 0.0; 
    }

    //getter method for totalCost
    public double getTotalCostOfRepairTasks (){
        return totalCostOfRepairTasks;
    }

    //getter for repairstasks list
    public List<RepairTaskDTO> getrepairTasks(){
        return repairTasks;
    } 
    
    /**
     * This method does not take any paramters, instead it changes the field of the repairorder,
     * so that the RepairOrdreState is marked as Accepted 
     * @param
     */
    public void setStateAccepted() {
        this.state = RepairOrderState.ACCEPTED;
    }

    public void setStateRejected() {
        this.state = RepairOrderState.REJECTED;
    }

    public void setStateNewlyCreated() {
        this.state = RepairOrderState.NEWLY_CREATED;
    }

    public void setStateReadyForApproval(){
        this.state = RepairOrderState.READY_FOR_APPROVAL;

    }

    /**
     * Adds a repairtask DTO to the arraylist repairTasks (containing RepairTaskDTO)
     * and adds the cost
     * @param newTask
     */  
    public void addRepairTask(RepairTaskDTO newTask) {
        repairTasks.add(newTask);
        totalCostOfRepairTasks += newTask.getCost();    // Automatically update total cost when task is added
    }

} 