    package se.kth.iv1350.bikeshop.dto; // DTO layer — only holds data, no business logic
    import java.time.LocalDate;
    import se.kth.iv1350.bikeshop.model.RepairOrder.RepairOrderState; // ArrayList = resizable list, used to store repair tasks

    
    /**
     * Hard-coded value for date in order to test the program
    */
    //public final int CURRENT_DATE = 260504;

    private final String repairOrderId;        // final = ID never changes after creation
    private final String problemDescription;    // final = problem description never changes
    private final LocalDate date;
    private int estimatedCompletionDate;
    private double totalCost;
    private RepairOrderState state;
    private BikeDTO bikeDTO;
    private String brand;
    
   
    /**
     * Creates a new instance with the specified repair order data
     *
     * @param repairOrderId             The unique ID of the repair order
     * @param problemDescription A description of the reported problem
     * @param date                      The date where bike was recieved
     * @param estimatedCompletitionDate Estimated date for completing bike reparation 
     * @param RepairOrderState                  The current state of the repair order
     */
    public class RepairOrderDTO {

    public RepairOrderDTO(String repairOrderId, String problemDescription, LocalDate date, int estimatedCompletitionDate, RepairOrderState state, BikeDTO bikeDTO) {
        this.repairOrderId = repairOrderId;         // Store the unique order ID
        this.problemDescription = problemDescription; // Store the reported problem
        this.date = date;
        this.estimatedCompletionDate = estimatedCompletitionDate;
        this.state = state;
        this.bikeDTO = bikeDTO;

    }
    //getter for observer impl
    public RepairOrderDTO getRepairOrderDTO(){

        //variables from bikeDTO...
        //BikeDTO bikeDTO = new bikeDTO;
        //bike

        return new RepairOrderDTO(repairOrderId, problemDescription, date, estimatedCompletionDate, state, bikeDTO);
    }

    //ta bort?
    public BikeDTO getBikeDTO(){
        return bikeDTO;
    }
    //ta bort?
    public String getBrand(){
        brand = bikeDTO.getBrand();
        return brand;
    }
 
    /** @return The unique repair order ID. */
    public String getRepairOrderId(){
        return repairOrderId;
    }

    /** @return The problem description. */
    public String getProblemDescription(){
        return problemDescription;
    }
    
        /**
         * Creates a new instance with the specified repair order data
         *
         * @param repairOrderId             The unique ID of the repair order
         * @param problemDescription A description of the reported problem
         * @param date                      The date where bike was recieved
         * @param estimatedCompletitionDate Estimated date for completing bike reparation 
         * @param RepairOrderState                  The current state of the repair order
         */

        public RepairOrderDTO(String repairOrderId, String problemDescription, LocalDate date, int estimatedCompletitionDate, RepairOrderState state) {
            this.repairOrderId = repairOrderId;         // Store the unique order ID
            this.problemDescription = problemDescription; // Store the reported problem
            this.date = date;
            this.estimatedCompletionDate = estimatedCompletitionDate;
            this.state = state;

        }

        /** @return The unique repair order ID. */
        public String getRepairOrderId(){
            return repairOrderId;
        }

        /** @return The problem description. */
        public String getProblemDescription(){
            return problemDescription;
        }
        
    
        /** @return The estimated completion date. */
        public int getEstimatedCompletionDate() {
            return estimatedCompletionDate;
        }

        /** @return The total cost of all repair tasks. */
        public double getTotalCost() {
            return totalCost;
        }

        /** @return The current state of the repair order. */
        public RepairOrderState getState() {
            return state;
        }

    }
