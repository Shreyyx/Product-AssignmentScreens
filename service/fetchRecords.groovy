// Ensure the context variables are retrieved from the service's input
def trainingId = context.trainingId
def trainingName = context.trainingName

// Initialize the entityFacade to query the database
def entityFacade = ec.entityFacade

// Prepare dynamic conditions for the query
def conditions = []
def parameters = []

// Add condition for trainingId if it is provided
if (trainingId) {
    conditions.add("trainingId = ?")
    parameters.add(trainingId)
}

// Add condition for trainingName if it is provided
if (trainingName) {
    conditions.add("trainingName LIKE ?")
    parameters.add("%${trainingName}%")  // Use LIKE for partial matching
}

// Build the WHERE clause based on provided conditions
def whereClause = conditions ? "WHERE " + conditions.join(" AND ") : ""

// Query the MoquiTraining records based on the constructed conditions
def results = entityFacade.find("tutorial.MoquiTraining", whereClause, parameters)

// Return the result set
return results
